package dev.ayam.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entry point for the Logback Appenders tutorial.
 * This class shows how a single log call can be directed to multiple
 * destinations
 * (Console, File, RollingFile) via the configurations in logback.xml.
 */
public class Main {
    // Standard SLF4J Logger initialization for this class.
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // These logs go to the Console AND specified files concurrently.
        logger.trace("Trace log - very detailed info.");
        logger.debug("Debug information is visible if log level is set in logback.xml");
        logger.info("Logging started dynamically!");
        logger.warn("Be careful with those logs!");
        logger.error("Error logging example!");

        System.out.println("Standard System.out still works too.");
    }
}
