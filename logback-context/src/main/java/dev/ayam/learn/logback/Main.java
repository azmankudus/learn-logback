package dev.ayam.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.UUID;

/**
 * Main entry point for the Logback Context module.
 * Demonstrates MDC (Mapped Diagnostic Context) to add contextual information to logs.
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // 1. Add contextual information to MDC
        MDC.put("userId", "user-123");
        MDC.put("transactionId", UUID.randomUUID().toString());

        try {
            logger.info("Starting process for user");

            // Log with context
            performAction();

            logger.info("Process completed successfully");
        } finally {
            // 2. Clear MDC to avoid context leakage between threads
            MDC.clear();
        }

        logger.info("Log without MDC context");
    }

    private static void performAction() {
        logger.debug("Business logic execution...");
        logger.warn("Sub-action may take longer than usual");
    }
}
