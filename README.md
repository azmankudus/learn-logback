# 🪵 Learn Logback 🚀

A sleek, minimal, and modern Java project designed to master the fundamentals of **Logback** and **SLF4J**.

---

## 🎨 Log Output Preview

Experience the power of colorized and structured logging!

```bash
15:09:41.441 [main] TRACE dev.ayam.learn.logback.Main - Trace log - very detailed info.
15:09:41.442 [main] INFO  dev.ayam.learn.logback.Main - Logging started dynamically!
15:09:41.442 [main] DEBUG dev.ayam.learn.logback.Main - Debug information is visible...
15:09:41.442 [main] WARN  dev.ayam.learn.logback.Main - Be careful with those logs!
15:09:41.442 [main] ERROR dev.ayam.learn.logback.Main - Error logging example!
```

---

## 🏗️ Core Architecture

This project uses a clean **Gradle** setup with a modern **Version Catalog** (`libs.versions.toml`).

### 📦 Dependencies
- **SLF4J API**: The standard facade for logging in the Java ecosystem.
- **Logback Classic**: The native implementation of SLF4J, known for its performance and flexibility.

---

## ⚙️ Configuration (`logback.xml`)

Location: `src/main/resources/logback.xml`

Our configuration features:
- **Console Appender**: Color-coded output for high visibility.
- **Rolling File Appender**: Logs are persistently saved in the `logs/` directory and rotate daily.
- **Custom Hierarchies**: Different log levels for different packages.

```xml
<root level="INFO">
    <appender-ref ref="CONSOLE" />
    <appender-ref ref="FILE" />
</root>

<logger name="dev.ayam" level="TRACE" />
```

---

## 🧠 Logging Levels Breakdown

| Level | Usage |
| :--- | :--- |
| **TRACE** | Extremely granular info (e.g., individual method calls). |
| **DEBUG** | Useful during development to diagnose issues. |
| **INFO** | Confirming that things are working as expected. |
| **WARN** | Indication of potential issues or unexpected paths. |
| **ERROR** | Serious issues that might prevent functionality. |

---

## 📚 Sample & Tutorial Projects

Explore specific modules to learn different Logback features step-by-step:

*   **[Logback Basic](logback-basic/)**: The perfect starting point for beginners. Master the `<root>` element, basic console appenders, and logging hierarchies.
*   **[Logback Appender](logback-appender/)**: Learn how to send logs to multiple destinations. Master `ConsoleAppender`, `FileAppender`, and the basics of multi-destination logging.
*   **[Logback Logger](logback-logger/)**: Master package-specific logging levels. Learn how to configure different logging strictness for different parts of your application (HR, IT, Sales).
*   **[Logback Rolling](logback-rolling/)**: Advanced history management. Learn about `RollingFileAppender`, `SizeAndTimeBasedRollingPolicy`, and how to prevent log files from taking over your disk.

---

## 🚀 Getting Started

### Prerequisites
- JDK 21+
- Gradle (provided wrapper)

### Commands

**Run a specific module (e.g., Logback Logger):**
```bash
./gradlew :logback-logger:run
```

**Check the persistent logs (if applicable):**
```bash
cat logback-appender/logs/simple-app.log
```

---

## 📂 Project Structure

```text
.
├── logback-basic/     # 🍼 Beginner basics
├── logback-appender/  # 📁 File & console destinations
├── logback-logger/    # 📦 Package-specific levels
├── logback-rolling/   # 🌀 Advanced log rotation
├── build.gradle.kts   # Project build config
└── gradle/
    └── libs.versions.toml # Dependency management
```

---

## 🛡️ License
Released under the [MIT License](LICENSE).

---
*Crafted with ❤️ for the Java community.*