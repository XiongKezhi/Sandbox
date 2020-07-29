package io.jenkins.plugins.checks.api;

import org.assertj.core.api.AbstractComparableAssert;

/**
 * {@link ChecksStatus} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class ChecksStatusAssert extends AbstractComparableAssert<ChecksStatusAssert, ChecksStatus> {

  /**
   * Creates a new <code>{@link ChecksStatusAssert}</code> to make assertions on actual ChecksStatus.
   * @param actual the ChecksStatus we want to make assertions on.
   */
  public ChecksStatusAssert(ChecksStatus actual) {
    super(actual, ChecksStatusAssert.class);
  }

  /**
   * An entry point for ChecksStatusAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myChecksStatus)</code> and get specific assertion with code completion.
   * @param actual the ChecksStatus we want to make assertions on.
   * @return a new <code>{@link ChecksStatusAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static ChecksStatusAssert assertThat(ChecksStatus actual) {
    return new ChecksStatusAssert(actual);
  }

}
