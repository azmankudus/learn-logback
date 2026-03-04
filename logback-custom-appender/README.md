# 🛠️ Logback Custom Appender

Build your own **Log Destination**!

## 🎯 Learning Objective
In this module, you will learn how to create a custom appender from scratch. You will master:
- **AppenderBase**: The primary class to extend for custom appenders.
- **Dependency Injection**: How Logback injects XML properties into Java fields using setters.
- **The Lifecycle**: Implementing the `append()` method.

## 💡 Key Facts
1.  **Generic Type**: `AppenderBase<E>` is generic. For standard logging events, we use `AppenderBase<ILoggingEvent>`.
2.  **Naming Convention**: If you have a property `<foo>bar</foo>` in your XML, Logback will look for a method `setFoo(String s)` in your Java class.
3.  **Thread Safety**: Appenders used in production should be thread-safe, as multiple threads might call the `append()` method simultaneously.

## 🧪 Implementation Detail
-   **Class**: `PrefixCustomAppender`
-   **Purpose**: To add a customizable prefix (like `[MY-LOG]`) to every message before outputting it.
-   **Output**: For simplicity, this custom appender writes directly to `System.out`, bypasses standard encoders for demonstration purposes.

## 🚀 Run the Example
```bash
./gradlew :logback-custom-appender:run
```

---
*Next Step: Explore [Custom Encoder](../logback-custom-encoder/) to learn how to transform logs into bytes!*
