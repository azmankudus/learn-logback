package dev.ayam.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Custom Rolling Demo Starting...");

        // Log 12 times to trigger roll twice (maxCount = 5)
        for (int i = 1; i <= 12; i++) {
            logger.info("Logging message number: {}", i);
        }

        logger.info("Custom Rolling Demo Finished.");
    }
}
