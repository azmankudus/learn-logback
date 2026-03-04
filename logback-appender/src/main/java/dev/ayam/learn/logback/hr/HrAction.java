package dev.ayam.learn.logback.hr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.ayam.learn.logback.Action;

/**
 * Demonstrates the HR department's logging behavior.
 */
public class HrAction extends Action {

  // Uses its own SLF4J logger for class-specific Logback configuration.
  private static final Logger logger = LoggerFactory.getLogger(HrAction.class);

  /**
   * Logs various levels of importance for the HR department.
   * Based on configuration, lower-level logs like TRACE or DEBUG may be hidden.
   */
  @Override
  public void action() {
    logger.trace("This is a TRACE log from HR");
    logger.debug("This is a DEBUG log from HR");
    logger.info("This is an INFO log from HR");
    logger.warn("This is a WARN log from HR");
    logger.error("This is an ERROR log from HR");
  }
}
