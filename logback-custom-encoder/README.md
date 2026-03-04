# 🛠️ Logback Custom Encoder

Discover how to transform logging events into **Byte Streams**!

## 🎯 Learning Objective
In this module, you will learn how to build a custom encoder. You will master:
- **EncoderBase**: The foundation for all Logback encoders.
- **Byte Array Management**: Working with character sets and byte conversion.
- **Headers & Footers**: Adding dynamic framing to your log output.

## 💡 Key Facts
1.  **Encoders are Powerful**: Unlike Layouts, Encoders can manage the entire lifecycle of the output stream. They are responsible for writing the bytes to the Appender's `OutputStream`.
2.  **Stateless or Stateful**: Encoders can maintain state between events (e.g., for calculating deltas or aggregating data before flush).
3.  **Layout Integration**: Most modern encoders (`LayoutWrappingEncoder`) actually wrap a **Layout** to do the string formatting, but you can build one without a layout for maximum performance or binary formats.

## 🧪 Implementation Detail
-   **Class**: `UpperCustomEncoder`
-   **Purpose**: To ensure all log messages are converted to shouting **UPPERCASE** and framed with session headers and footers.
-   **Example Output**:
    ```text
    --- LOG SESSION START ---
    MAIN CLASS STARTING...
    HELLO WORLD FROM LOGBACK!
    --- LOG SESSION END ---
    ```

## 🚀 Run the Example
```bash
./gradlew :logback-custom-encoder:run
```

---
*Next Step: Explore [Custom Layout](../logback-custom-layout/) to learn how to format your strings!*
