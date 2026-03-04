package dev.ayam.learn.logback;

import dev.ayam.learn.logback.hr.HrAction;
import dev.ayam.learn.logback.it.ItAction;
import dev.ayam.learn.logback.sales.SalesAction;

/**
 * Entry point for the Logback Packaging/Multi-Logger tutorial.
 * This class coordinates actions from different departments to demonstrate
 * package-specific logging levels.
 */
public class Main {
    public static void main(String[] args) {
        // Demonstrate HR's logging behavior (controlled in logback.xml)
        Action hr = new HrAction();
        hr.action();

        // Demonstrate IT's logging behavior (controlled in logback.xml)
        Action it = new ItAction();
        it.action();

        // Demonstrate Sales' logging behavior (controlled in logback.xml)
        Action sales = new SalesAction();
        sales.action();
    }
}
