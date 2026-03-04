<a id="top"></a>
<a href="../README.md" style="float: right;">... back to main</a>

# 🛠️ Logback Custom Appender

Build your own **Log Destination**!

---

## 📑 Table of Contents
- <a href="#learning-objective">🎯 Learning Objective</a>
- <a href="#key-facts">💡 Key Facts</a>
- <a href="#implementation">🧪 Implementation Detail</a>
- <a href="#run-example">🚀 Run the Example</a>

---

<a id="learning-objective"></a>
## 🎯 Learning Objective <a href="#top" style="float: right;">🔝</a>
In this module, you will learn how to create a custom appender from scratch. You will master:
- **AppenderBase**: The primary class to extend.
- **Dependency Injection**: Logback properties and Java setters.
- **The Lifecycle**: Implementing the `append()` method.

---

<a id="key-facts"></a>
## 💡 Key Facts <a href="#top" style="float: right;">🔝</a>
1.  **Generic Type**: Use `AppenderBase<ILoggingEvent>` for standard logging.
2.  **Naming Convention**: XML tags map directly to Java setters.
3.  **Thread Safety**: Production appenders must be thread-safe.

---

<a id="implementation"></a>
## 🧪 Implementation Detail <a href="#top" style="float: right;">🔝</a>
-   **Class**: `PrefixCustomAppender`
-   **Purpose**: Add a customizable prefix (like `[MY-LOG]`) to messages.
-   **Output**: Writes directly to `System.out` for demonstration.

---

<a id="run-example"></a>
## 🚀 Run the Example <a href="#top" style="float: right;">🔝</a>
```bash
./gradlew :logback-custom-appender:run
```

---
*Next Step: Explore [Custom Encoder](../logback-custom-encoder/) to learn how to transform logs into bytes!*
