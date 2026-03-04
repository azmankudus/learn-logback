package dev.ayam.learn.logback.custom;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * PrefixCustomAppender: A custom Logback appender.
 * Extends AppenderBase to handle the basic lifecycle (start/stop).
 */
public class PrefixCustomAppender extends AppenderBase<ILoggingEvent> {

  // Properties in logback.xml are injected via setter methods
  private String prefix = "[CUSTOM]";

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  /**
   * Main method called for every logging event.
   */
  @Override
  protected void append(ILoggingEvent eventObject) {
    // We manually format and print to System.out for this demo
    String formattedMsg = prefix + " " + eventObject.getFormattedMessage();
    System.out.println(formattedMsg);
  }
}
