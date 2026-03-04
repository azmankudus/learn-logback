<a id="top"></a>
<a href="../README.md" style="float: right;">... back to main</a>

# ⚡ Logback Async

Master high-performance logging with **Asynchronous Appenders**!

---

## 📑 Table of Contents
- <a href="#learning-objective">🎯 Learning Objective</a>
- <a href="#key-facts">💡 Key Facts</a>
- <a href="#properties">⚙️ Configuration Properties</a>
- <a href="#scenario">🧪 Scenario Demonstrated</a>
- <a href="#run-example">🚀 Run the Example</a>

---

<a id="learning-objective"></a>
## 🎯 Learning Objective <a href="#top" style="float: right;">🔝</a>
In this module, you will learn how to prevent logging from slowing down your main application logic. You will master:
- **AsyncAppender**: A wrapper appender that uses a background thread.
- **Queue Management**: Configuring buffer sizes to handle log bursts.
- **Discarding Strategies**: Deciding when to drop logs to save the system.

---

<a id="key-facts"></a>
## 💡 Key Facts <a href="#top" style="float: right;">🔝</a>
1.  **Blocking by Default**: Standard appenders block the main application thread.
2.  **The Worker Pattern**: `AsyncAppender` puts events into a `BlockingQueue`.
3.  **Lossy Logging**: `AsyncAppender` will drop specific events if the queue is full.

---

<a id="properties"></a>
## ⚙️ Configuration Properties <a href="#top" style="float: right;">🔝</a>
-   **queueSize**: Handler for burst capacity.
-   **discardingThreshold**: Event drop percentage.
-   **includeCallerData**: Performance-degrading caller tracking.
-   **neverBlock**: Force dropping over blocking.

> [!WARNING]
> **Data Loss Risk**: `AsyncAppender` is "lossy" and might lose audit-critical logs during bursts.

---

<a id="scenario"></a>
## 🧪 Scenario Demonstrated <a href="#top" style="float: right;">🔝</a>
-   **Main Thread Performance**: Log 10,000 messages in a tight loop.
-   **Background Processing**: Notice how the main thread finishes in milliseconds.

---

<a id="run-example"></a>
## 🚀 Run the Example <a href="#top" style="float: right;">🔝</a>
```bash
./gradlew :logback-async:run
```

---
*Next Step: Move on to custom extensions or explore [Logback Context](../logback-context/) for dynamic data!*
