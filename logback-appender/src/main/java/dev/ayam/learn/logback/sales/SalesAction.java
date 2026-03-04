package dev.ayam.learn.logback.sales;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.ayam.learn.logback.Action;

/**
 * Demonstrates the Sales department's logging behavior.
 */
public class SalesAction extends Action {

  // Specific logger to demonstrate the SALES department filtering levels.
  private static final Logger logger = LoggerFactory.getLogger(SalesAction.class);

  /**
   * Logs various levels of feedback for Sales actions.
   * If the config level is set to TRACE, all these messages will be displayed.
   */
  @Override
  public void action() {
    logger.trace("This is a TRACE log from SALES");
    logger.debug("This is a DEBUG log from SALES");
    logger.info("This is an INFO log from SALES");
    logger.warn("This is a WARN log from SALES");
    logger.error("This is an ERROR log from SALES");
  }
}
