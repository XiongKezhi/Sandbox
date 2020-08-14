node {
    stage ('Checkout') {
        git branch:'coverage', url: 'https://github.com/XiongKezhi/Sandbox'
    }

    stage ('Line and Branch Coverage') {
        withMaven {
            sh "mvn -V -U -e jacoco:prepare-agent test jacoco:report -Dmaven.test.failure.ignore"
        }
        publishCoverage adapters: [jacocoAdapter('**/*/jacoco.xml')], sourceFileResolver: sourceFiles('STORE_ALL_BUILD')
    }
}
