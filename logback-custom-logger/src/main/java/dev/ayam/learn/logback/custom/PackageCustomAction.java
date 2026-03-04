package dev.ayam.learn.logback.custom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackageCustomAction {
  private static final Logger logger = LoggerFactory.getLogger(PackageCustomAction.class);

  public void logSomething() {
    logger.trace("Custom Logger - Trace");
    logger.debug("Custom Logger - Debug");
    logger.info("Custom Logger - Info");
    logger.warn("Custom Logger - Warn");
    logger.error("Custom Logger - Error");
  }
}
