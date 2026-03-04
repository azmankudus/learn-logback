# ⚓ Logback Appender

Learn how to route your logs to multiple destinations!

## 🎯 Learning Objective
In this module, you will explore the various ways Logback can output data. You will master:
- **ConsoleAppender**: The standard live output.
- **FileAppender**: Persistent plain-text logging.
- **HTMLLayout**: Generating visually appealing reports.
- **SyslogAppender**: Sending logs to system-level log collectors.

## 💡 Key Facts
1.  **Immediate Flush**: By default, appenders flush to the underlying stream immediately. This ensures logs are written even if the app crash, but it can impact performance under extreme load.
2.  **Layout vs Encoder**: Encoders (introduced in Logback 0.9.19) are more flexible than Layouts because they have total control over the byte array written to the Appender.
3.  **Appender Ref**: Appenders are defined once but can be referenced by multiple loggers via `<appender-ref ref="NAME" />`.

## 📂 Multi-Format Strategy
In this project, we demonstrate:
- **Plain Text**: Standard logging for developer troubleshooting (`it-app.log`).
- **HTML Reports**: Human-readable tables for management/HR review (`hr-report.html`).
- **Standard Out**: Real-time console monitoring with **Color Highlighting**.

## 🚀 Run the Example
```bash
./gradlew :logback-appender:run
```

---
*Next Step: Explore [Logback Rolling](../logback-rolling/) to learn about automated log cleanup!*
