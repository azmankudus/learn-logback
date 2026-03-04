package dev.ayam.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entry point for the Logback Basics module.
 * Demonstrates basic usage of SLF4J loggers at different levels.
 */
public class Main {
    // Standard SLF4J Logger initialization for this class.
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Logs are filtered based on the <root level="..."> in logback.xml
        logger.trace("Trace log - very detailed info.");
        logger.debug("Debug information is visible if log level is set in logback.xml");
        logger.info("Logging started dynamically!");
        logger.warn("Be careful with those logs!");
        logger.error("Error logging example!");

        // Showing that standard output still flows to the same terminal.
        System.out.println("Standard System.out still works too.");
    }
}
