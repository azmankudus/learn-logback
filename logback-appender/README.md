# 🪵 Logback Appenders: The Output Master 🚀

Welcome to the **Logback Appenders** module! This sub-project teaches you how to direct your logs to multiple destinations at the same time.

---

## 🏗️ What is an Appender?

In Logback, an **Appender** is the component responsible for the actual output of your logs. A single Logger can have multiple Appenders attached to it via `<appender-ref>` tags.

---

## 🛠️ Appenders in this Tutorial

### 1. `ConsoleAppender`
Sends logs straight to your console (Standard Out).
*   **Best for**: Local development and real-time monitoring.
*   **Features**: We use the `%highlight` pattern here for colorized output!

### 2. `FileAppender`
Writes every log entry into a single specified file.
*   **Best for**: Simple log collection for legacy apps or single-session scripts.
*   **Configuration**:
    ```xml
    <file>logs/simple-app.log</file>
    <append>true</append>
    ```

### 3. `RollingFileAppender`
The "intelligent" file appender that can split, rotate, and archive logs.
*   **Best for**: Production environments.
*   **How it works**: It uses a **Rolling Policy** to decide when to create a new file (e.g., daily) and where to move the old ones.

---

## ⚙️ Using Properties for Paths

Logback allows you to define variables using the `<property>` tag. This is extremely useful for centralizing file paths so you don't have to repeat strings like `logs/` everywhere.

### Defining a Path Property:
```xml
<property name="LOG_DIR" value="logs" />
```

### Using the Property:
You can reference the property anywhere using the `${PROPERTY_NAME}` syntax:
```xml
<appender name="FILE" class="ch.qos.logback.core.FileAppender">
    <file>${LOG_DIR}/simple-app.log</file>
    ...
</appender>
```
This ensures that if you ever need to change your log directory to `/var/log/my-app/`, you only need to update it in one place!

---

## 🧩 Combining Appenders

You don't have to choose just one! You can attach all of them to your root logger:

```xml
<root level="INFO">
    <appender-ref ref="CONSOLE" />
    <appender-ref ref="FILE" />
    <appender-ref ref="ROLLING" />
</root>
```

When you call `logger.info("message")`, Logback ensures that one message is sent to the terminal, one to the simple log file, and one to the rolling log file.

---

## 🚀 Lab: Explore the Files

1. Run the application:
   ```bash
   cd logback-appender && ./gradlew run
   ```
2. Check your project folder. You should see a new `logs/` directory!
3. Compare the content of `logs/simple-app.log` and `logs/rolling-app.log`.
4. Notice how the Console shows colors, while the log files use a standard, more searchable format.

---
*Stay organized, stay logging!* 🪵
