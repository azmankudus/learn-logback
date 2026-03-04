# 🪵 Logback Basics: Learning 🚀

Welcome to the **Logback Basics** module! This sub-project is designed to teach you the fundamental structures of Logback configuration and how to implement it effectively in Java.

---

## 🏗️ The Anatomy of `logback.xml`

Every Logback configuration typically resides in `src/main/resources/logback.xml`. Here is a breakdown of the core elements:

### 1. `<configuration>`
The root element that wraps all Logback settings.
*   **Attributes**: Can include `scan="true"` to reload config files automatically when they change!

### 2. `<appender>`
Appenders are responsible for **where** the logs go (Console, File, Database, etc.).
*   **ConsoleAppender**: Sends logs to `System.out` or `System.err`.
*   **RollingFileAppender**: Writes to a file and "rolls" it (creates new files) based on size or time.

### 3. `<encoder>` & `<pattern>`
The encoder transforms an incoming event into a byte array and writes it out. The **Pattern** defines the visual format:
*   `%d{HH:mm:ss.SSS}`: Timestamp with milliseconds.
*   `%thread`: Name of the thread that generated the log.
*   `%-5level`: Log level (e.g., INFO, ERROR), padded to 5 characters.
*   `%logger{36}`: Name of the logger (usually the class name), truncated to 36 chars.
*   `%msg`: The actual log message you wrote in code.
*   `%n`: Platform-dependent line separator.

### 4. `<root>`
The `<root>` element is the ultimate parent of all loggers. It defines the global logging level and which appenders should be used across the entire application.

---

## 🔝 Logging Levels Hierarchy

Logback follows a strict hierarchy. If you set a level in `<root>`, only that level and those **above** it (higher severity) will be displayed.

| Level | Severity | Description |
| :--- | :--- | :--- |
| **TRACE** | Lowest | Extremely granular info (e.g., method entry/exit). |
| **DEBUG** | Low | Diagnostic info for developers. |
| **INFO** | Medium | Standard application events (Start/Stop). |
| **WARN** | High | Potential issues that aren't errors yet. |
| **ERROR** | Critical | Serious failures that impact functionality. |

---

## ⌨️ Implementation in Java (SLF4J)

Always use the **SLF4J** facade to keep your code decoupled from the logging implementation.

```java
package dev.ayam.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    // 1. Initialize the Logger
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // 2. Use different levels
        logger.trace("Fine-grained detail");
        logger.debug("Debugging data");
        logger.info("Application event");
        logger.warn("Potential issue");
        logger.error("Something went wrong");
    }
}
```

---

## 🖼️ Expected Output Examples

Depending on the `level` attribute in your `<root>` element:

### If `<root level="TRACE">` (Show Everything)
```text
15:30:00.121 TRACE dev.ayam.Main - Fine-grained detail
15:30:00.122 DEBUG dev.ayam.Main - Debugging data
15:30:00.123 INFO  dev.ayam.Main - Application event
15:30:00.124 WARN  dev.ayam.Main - Potential issue
15:30:00.125 ERROR dev.ayam.Main - Something went wrong
```

### If `<root level="INFO">` (Common for Production)
```text
15:30:00.123 INFO  dev.ayam.Main - Application event
15:30:00.124 WARN  dev.ayam.Main - Potential issue
15:30:00.125 ERROR dev.ayam.Main - Something went wrong
```

### If `<root level="ERROR">` (Only Critical)
```text
15:30:00.125 ERROR dev.ayam.Main - Something went wrong
```

---

## 🚀 Lab: Try it yourself!

1. Open `logback-basic/src/main/resources/logback.xml`.
2. Change `<root level="INFO">` to `<root level="ERROR">`.
3. Run the app:
   ```bash
   cd logback-basic && ./gradlew run
   ```
4. Observe that only the red `ERROR` log remains!

---
*Back to mastering Java logs!* 🪵
