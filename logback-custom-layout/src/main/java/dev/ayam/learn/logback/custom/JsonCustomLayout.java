package dev.ayam.learn.logback.custom;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;

/**
 * A simple custom layout that formats logs as a basic JSON-like string.
 */
/**
 * JsonCustomLayout: A custom Logback layout.
 * Layouts are responsible for transforming a logging event into a String.
 */
public class JsonCustomLayout extends LayoutBase<ILoggingEvent> {

  // Properties are injected via setter methods
  private String serviceName = "unknown-service";

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * core method that returns the string representation of the event.
   */
  @Override
  public String doLayout(ILoggingEvent event) {
    // We format the log data as a JSON string for this demo
    return String.format(
        "{\"service\": \"%s\", \"level\": \"%s\", \"logger\": \"%s\", \"msg\": \"%s\"}%n",
        serviceName,
        event.getLevel(),
        event.getLoggerName(),
        event.getFormattedMessage());
  }
}
