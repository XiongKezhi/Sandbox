package io.jenkins.plugins.checks.api;

import org.assertj.core.api.AbstractObjectAssert;

/**
 * {@link ChecksPublisher} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class ChecksPublisherAssert extends AbstractObjectAssert<ChecksPublisherAssert, ChecksPublisher> {

  /**
   * Creates a new <code>{@link ChecksPublisherAssert}</code> to make assertions on actual ChecksPublisher.
   * @param actual the ChecksPublisher we want to make assertions on.
   */
  public ChecksPublisherAssert(ChecksPublisher actual) {
    super(actual, ChecksPublisherAssert.class);
  }

  /**
   * An entry point for ChecksPublisherAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myChecksPublisher)</code> and get specific assertion with code completion.
   * @param actual the ChecksPublisher we want to make assertions on.
   * @return a new <code>{@link ChecksPublisherAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static ChecksPublisherAssert assertThat(ChecksPublisher actual) {
    return new ChecksPublisherAssert(actual);
  }

}
