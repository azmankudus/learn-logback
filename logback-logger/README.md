# 🪵 Logback: Multi-Package Loggers 🚀

Welcome to the **Multi-Package Loggers** module! This project demonstrates how to configure different logging levels for different packages in your Java application.

---

## 🏗️ The Problem: One Level Doesn't Fit All

In a real application, you might want:
*   **HR Module**: Only `INFO` level (to keep it clean).
*   **IT Module**: `DEBUG` level (to help troubleshooting).
*   **Sales Module**: `TRACE` level (maximum visibility for every action).

Logback allows you to achieve this using the `<logger>` element.

---

## 🛠️ Configuration (`logback.xml`)

Instead of just a single `<root>` logger, we define specific loggers for our packages:

```xml
<!-- 1. HR Package: Only INFO and above -->
<logger name="dev.ayam.learn.logback.hr" level="INFO">
    <appender-ref ref="CONSOLE" />
</logger>

<!-- 2. IT Package: DEBUG and above -->
<logger name="dev.ayam.learn.logback.it" level="DEBUG">
    <appender-ref ref="CONSOLE" />
</logger>

<!-- 3. Sales Package: Everything (TRACE) -->
<logger name="dev.ayam.learn.logback.sales" level="TRACE">
    <appender-ref ref="CONSOLE" />
</logger>

<!-- Root Logger: Acts as a fallback for everything else -->
<root level="ERROR">
    <appender-ref ref="CONSOLE" />
</root>
```

---

## 🔝 Additivity Node

By default, if you define a logger for a package, it still "bubbles up" to the root logger. This is called **Additivity**. 
*   If we didn't add `<appender-ref ref="CONSOLE" />` inside each logger, they would use the Root's appenders.
*   If we **do** add them (like above), logs might appear **twice** if the root also has the same appender! 😲
*   To prevent this, you can set `additivity="false"` on the logger.

---

## 🚀 Lab: See it in Action

1. Run the application:
   ```bash
   cd logback-logger && ./gradlew run
   ```

2. **Observe the differences**:
   *   **HR Logs**: You will only see `INFO`, `WARN`, and `ERROR`. `TRACE` and `DEBUG` are filtered out because HR is set to `INFO`.
   *   **IT Logs**: You will see `DEBUG`, `INFO`, `WARN`, and `ERROR`. Only `TRACE` is filtered out because IT is set to `DEBUG`.
   *   **Sales Logs**: You will see **ALL** logs (TRACE, DEBUG, INFO, WARN, ERROR) because Sales is set to `TRACE`.

3. **Check for Redundant Logs**:
   In the initial configuration, logs appeared twice! This happened because they were sent to the `CONSOLE` appender by the package logger AND reached the Root logger's `CONSOLE` appender. We fixed this by removing the redundant `appender-ref` from the specific loggers, letting them inherit the root's appender instead.

---

## 📂 Project Structure

```text
logback-logger/
├── hr/
│   └── HrAction.java    (INFO level)
├── it/
│   └── ItAction.java    (DEBUG level)
└── sales/
    └── SalesAction.java (TRACE level)
```

---
*Master the package structure, master the logs!* 🪵
