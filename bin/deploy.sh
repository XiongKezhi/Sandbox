#!/bin/bash

mvn clean install -Pskip || { echo "Build failed"; exit 1; }

JENKINS_HOME=../docker/jenkins_home

echo "Installing plugin checks-api in $JENKINS_HOME"
rm -rf $JENKINS_HOME/plugins/checks-api*
cp -fv ./target/checks-api.hpi $JENKINS_HOME/plugins/checks-api.jpi

CURRENT_UID="$(id -u):$(id -g)"
export CURRENT_UID
IS_RUNNING=$(docker ps -q --filter name=docker_jenkins_1)
if [[ "$IS_RUNNING" != "" ]]; then
    cd ../docker || exit 1
    docker-compose restart
    echo "Restarting Jenkins (docker compose with user ID ${CURRENT_UID}) ..."
fi
