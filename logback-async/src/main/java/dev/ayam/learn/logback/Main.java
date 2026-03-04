package dev.ayam.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Async Logging Demo Starting...");

        long startTime = System.currentTimeMillis();

        // Log 10,000 messages
        // Without AsyncAppender, the main thread would block on I/O for every message
        for (int i = 1; i <= 10000; i++) {
            logger.info("This is log message number #{}", i);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        logger.info("Main thread finished logging 10,000 messages in {} ms", duration);
        logger.info("Notice that the main thread finishes EXTREMELY fast because it only puts events into a queue.");
        logger.info("The actual writing to Console/File happens in the background 'logback-1' thread pool.");

        // Wait a bit to let the background thread finish flushing the queue
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("Demo Finished.");
    }
}
