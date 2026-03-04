package dev.ayam.learn.logback;

import dev.ayam.learn.logback.custom.PackageCustomAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Main class starting...");

        PackageCustomAction custom = new PackageCustomAction();
        custom.logSomething();

        logger.info("Main class finishing...");
    }
}
