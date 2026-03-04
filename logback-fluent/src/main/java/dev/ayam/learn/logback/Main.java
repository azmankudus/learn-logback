package dev.ayam.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * Main entry point for the Logback Fluent API module.
 * Demonstrates the modern SLF4J 2.0+ Fluent Logging API.
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final Marker SECURITY = MarkerFactory.getMarker("SECURITY");

    public static void main(String[] args) {
        String user = "azmankudus";
        int orderId = 98765;

        // 1. Basic usage: logger.atLevel().log("...")
        logger.atInfo().log("1. Application is starting up in fluent mode.");

        // 2. Parameterized Logging via Fluent API
        logger.atInfo()
                .addArgument(user)
                .log("2. Processing login for user: {}");

        // 3. Structured Data (Key-Value)
        // This is extremely helpful for log aggregators (e.g., Splunk, ELK)
        logger.atInfo()
                .addKeyValue("orderId", orderId)
                .addKeyValue("status", "PENDING")
                .log("3. New order created.");

        // 4. Handling Exceptions with setCause()
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.atError()
                    .setCause(e)
                    .log("4. Math error occurred!");
        }

        // 5. Using Markers with Fluent API
        logger.atWarn()
                .addMarker(SECURITY)
                .log("5. Security marker attached to this log.");

        // 6. Conditional Logging (if enabled)
        // Note: The Fluent API handles 'isLevelEnabled' internally, the 'log()' call 
        // will only execute it if the level is actually enabled.
        logger.atDebug()
                .log("6. Debug message (only visible if DEBUG is enabled in logback.xml).");

        logger.atInfo().log("7. All fluent logging examples completed.");
    }
}
