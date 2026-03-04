package dev.ayam.learn.logback.it;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.ayam.learn.logback.Action;

/**
 * Demonstrates the IT department's logging behavior.
 */
public class ItAction extends Action {

  // Uses a specific logger for this class to allow for package-level filtering.
  private static final Logger logger = LoggerFactory.getLogger(ItAction.class);

  /**
   * Logs messages at all levels to test how Logback filters them.
   * Based on our logback.xml configuration, some levels might be suppressed.
   */
  @Override
  public void action() {
    logger.trace("This is a TRACE log from IT");
    logger.debug("This is a DEBUG log from IT");
    logger.info("This is an INFO log from IT");
    logger.warn("This is a WARN log from IT");
    logger.error("This is an ERROR log from IT");
  }
}
