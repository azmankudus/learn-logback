package dev.ayam.learn.logback.custom;

import ch.qos.logback.core.rolling.TriggeringPolicyBase;
import java.io.File;

/**
 * CountCustomTriggeringPolicy: A custom triggering policy for Logback.
 * Triggering policies decide WHEN a rollover should happen.
 */
public class CountCustomTriggeringPolicy<E> extends TriggeringPolicyBase<E> {

  // Threshold configured via logback.xml
  private int maxCount = 10;
  private int counter = 0;

  public void setMaxCount(int maxCount) {
    this.maxCount = maxCount;
  }

  /**
   * Called for every logging event. Return true to trigger a rollover.
   */
  @Override
  public boolean isTriggeringEvent(File activeFile, E event) {
    counter++;
    if (counter >= maxCount) {
      // Once we hit the limit, reset and trigger
      counter = 0;
      return true;
    }
    return false;
  }
}
