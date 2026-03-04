package dev.ayam.learn.logback;

/**
 * Base abstract class for different actions in our Logback learning module.
 * This class provides a common base for all departments (HR, IT, Sales)
 * to demonstrate how their logs are filtered according to the configuration.
 */
public abstract class Action {

  /**
   * The core method where each action's logic is implemented.
   * This is where specific logs are written to demonstrate filtering behavior.
   */
  public abstract void action();
}
