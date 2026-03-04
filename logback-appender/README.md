<a id="top"></a>
<a href="../README.md" style="float: right;">Direct back to main</a>

# ⚓ Logback Appender

Learn how to route your logs to multiple destinations!

---

## 📑 Table of Contents
- <a href="#learning-objective">🎯 Learning Objective</a>
- <a href="#key-facts">💡 Key Facts</a>
- <a href="#strategy">📂 Multi-Format Strategy</a>
- <a href="#run-example">🚀 Run the Example</a>

---

<a id="learning-objective"></a>
## 🎯 Learning Objective <a href="#top" style="float: right;">🔝</a>
In this module, you will explore the various ways Logback can output data. You will master:
- **ConsoleAppender**: The standard live output.
- **FileAppender**: Persistent plain-text logging.
- **HTMLLayout**: Generating visually appealing reports.
- **SyslogAppender**: Sending logs to system-level log collectors.

---

<a id="key-facts"></a>
## 💡 Key Facts <a href="#top" style="float: right;">🔝</a>
1.  **Immediate Flush**: By default, appenders flush to the underlying stream immediately. This ensures logs are written even if the app crash, but it can impact performance under extreme load.
2.  **Layout vs Encoder**: Encoders (introduced in Logback 0.9.19) are more flexible than Layouts because they have total control over the byte array written to the Appender.
3.  **Appender Ref**: Appenders are defined once but can be referenced by multiple loggers via `<appender-ref ref="NAME" />`.

---

<a id="strategy"></a>
## 📂 Multi-Format Strategy <a href="#top" style="float: right;">🔝</a>
In this project, we demonstrate:
- **Plain Text**: Standard logging for developer troubleshooting (`it-app.log`).
- **HTML Reports**: Human-readable tables for management/HR review (`hr-report.html`).
- **Standard Out**: Real-time console monitoring with **Color Highlighting**.

---

<a id="run-example"></a>
## 🚀 Run the Example <a href="#top" style="float: right;">🔝</a>
```bash
./gradlew :logback-appender:run
```

---
*Next Step: Explore [Logback Rolling](../logback-rolling/) to learn about automated log cleanup!*
