package dev.ayam.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entry point for the Logback Condition module.
 * Demonstrates environment-specific configuration using conditional logic in logback.xml.
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String env = System.getProperty("APP_ENV", "DEVELOPMENT");
        logger.info("Current Application Environment: {}", env);

        logger.debug("Debug message - only visible in DEVELOPMENT environment.");
        logger.info("Informational message - visible in all environments.");
        logger.warn("Warning message - action might be needed.");
        logger.error("Error message - high priority issue!");

        System.out.println("\n--- TIP ---");
        System.out.println("Try running with -DAPP_ENV=PROD to see how the output changes!");
    }
}
