package dev.ayam.learn.logback.custom;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.encoder.EncoderBase;

import java.nio.charset.StandardCharsets;

/**
 * A simple custom encoder that converts all log messages to UPPERCASE.
 */
/**
 * UpperCustomEncoder: A custom Logback encoder.
 * Encoders convert logging events into byte arrays.
 */
public class UpperCustomEncoder extends EncoderBase<ILoggingEvent> {

  /**
   * Optional: Text added to the very beginning of the log stream.
   */
  @Override
  public byte[] headerBytes() {
    return "--- LOG SESSION START ---\n".getBytes(StandardCharsets.UTF_8);
  }

  /**
   * The core method that transforms the event into bytes.
   */
  @Override
  public byte[] encode(ILoggingEvent event) {
    // We transform the message to UPPERCASE for this demo
    String msg = event.getFormattedMessage().toUpperCase() + "\n";
    return msg.getBytes(StandardCharsets.UTF_8);
  }

  /**
   * Optional: Text added to the very end of the log stream.
   */
  @Override
  public byte[] footerBytes() {
    return "--- LOG SESSION END ---\n".getBytes(StandardCharsets.UTF_8);
  }
}
