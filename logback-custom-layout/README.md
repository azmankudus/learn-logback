# 🛠️ Logback Custom Layout

Learn how to create structured **String Outputs**!

## 🎯 Learning Objective
In this module, you will learn how to build a custom layout. You will master:
- **LayoutBase**: The base class for all Logback layouts.
- **String Formatting**: Creating custom string representations of log events.
- **LayoutWrappingEncoder**: How to use a Layout within a modern Encoder system.

## 💡 Key Facts
1.  **Layout vs Encoder**: A Layout only converts an event to a **String**. An Encoder converts it to a **byte array**. Layouts are usually wrapped by a `LayoutWrappingEncoder`.
2.  **Stateless Utility**: Layouts are typically stateless and focused solely on the visual formatting logic.
3.  **Structured Logs**: Modern logging often requires JSON or CSV formats. While Logback has built-in support for some, creating a custom layout is the best way to handle unique internal log standards.

## 🧪 Implementation Detail
-   **Class**: `JsonCustomLayout`
-   **Purpose**: To format every log entry as a single-line JSON object.
-   **Configuration**: The `serviceName` is injected via XML, allowing the same layout class to be used by different services with different identifiers.
-   **Example Output**:
    ```json
    {"service": "MyAwesomeService", "level": "INFO", "logger": "dev.ayam.Main", "msg": "Main class starting..."}
    ```

## 🚀 Run the Example
```bash
./gradlew :logback-custom-layout:run
```

---
*Next Step: Explore [Custom Rolling](../logback-custom-rolling/) to learn about advanced rotation triggers!*
