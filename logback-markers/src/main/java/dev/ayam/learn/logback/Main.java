package dev.ayam.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * Main entry point for the Logback Markers module.
 * Demonstrates the use of SLF4J Markers for tagging log events.
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    // 1. Create Markers using MarkerFactory
    private static final Marker CONFIDENTIAL = MarkerFactory.getMarker("CONFIDENTIAL");
    private static final Marker SECURITY = MarkerFactory.getMarker("SECURITY");

    public static void main(String[] args) {
        // Standard log without markers
        logger.info("Application starting...");

        // 2. Log with a specific Marker
        logger.info(SECURITY, "User login attempt from IP: 192.168.1.1");

        // 3. Log with another Marker
        // This will be filtered out by the 'CONFIDENTIAL_FILTER' in logback.xml
        logger.info(CONFIDENTIAL, "Scanning sensitive user data: user_id=456");

        logger.warn(SECURITY, "Invalid password attempt for account: admin");

        logger.info("Application shutting down.");
    }
}
