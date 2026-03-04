package dev.ayam.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entry point for the Logback Rolling Policy module.
 * This class triggers file rotation by logging many messages rapidly.
 */
public class Main {
    // Standard SLF4J Logger initialization for this class.
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Application started. Rolling policy is active.");

        // We log multiple messages to trigger a 'roll' (file rotation).
        // Our limit in logback.xml is set to 10KB to make this happen quickly!
        for (int i = 1; i <= 500; i++) {
            logger.info("This is message number {} - Filling up the log file...", i);
        }

        logger.info("Finished logging 500 messages. Check the 'logs/archived/' folder for rotated logs!");
    }
}
