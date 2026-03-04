package dev.ayam.learn.logback.custom;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

/**
 * A custom filter that denies events containing a specific forbidden word.
 */
/**
 * WordCustomFilter: A custom Logback filter.
 * Filters decide whether a log event should be processed or ignored.
 */
public class WordCustomFilter extends Filter<ILoggingEvent> {

  // Property injected via XML
  private String word;

  public void setWord(String word) {
    this.word = word;
  }

  /**
   * Decides the fate of the log event.
   */
  @Override
  public FilterReply decide(ILoggingEvent event) {
    if (event.getMessage() != null && event.getMessage().contains(word)) {
      // If the message contains our forbidden word, we DENY it
      return FilterReply.DENY;
    }
    // Otherwise, stay NEUTRAL to let other filters or the system decide
    return FilterReply.NEUTRAL;
  }
}
