# 🪵 Learn Logback 🚀

A comprehensive repository for mastering **Logback** and **SLF4J**, from basic configurations to complex custom components.

---

## 🏗️ How Logback Works (Data Flow)

Understanding the lifecycle of a log event is key to mastering Logback.

1.  **🚀 Logger**: Application call triggers `ILoggingEvent` creation and **MDC** snapshot.
2.  **⚡ TurboFilter**: Global context-wide filters (e.g., `MDCFilter`) are evaluated first.
3.  **📏 Effective Level**: Logger verifies if the event level is enabled based on hierarchy.
4.  **🏗️ Appender**: The event is dispatched to the **Appender List** (respecting **Additivity**).
5.  **🔍 Filter**: Appender-level **Filters** decide the final fate (`ACCEPT`, `DENY`, `NEUTRAL`).
6.  **📐 Encoder**: The **Encoder** (or **Layout**) transforms the event into a byte stream.
7.  **🏁 Destination**: The final target output (Console, File, or Remote server).

> [!TIP]
> **Performance Tip**: Always use the **SLF4J parameterized logging** (`logger.info("User {} logged in", user);`) instead of string concatenation to avoid unnecessary string creations when the log level is disabled.

---

## 📚 Learning Path

Explore the projects in this sequence to build your knowledge from the ground up:

### 🍼 1. Basic
*   **[Logback Basic](logback-basic/)**: The absolute entry point. SLF4J setup and basic XML structure.

### ⚓ 2. Built-in Features
Explore the core batteries-included features of Logback:
*   **[Logger](logback-logger/)**: Package-specific hierarchies and level management (IT, HR, Sales).
*   **[Appender](logback-appender/)**: Multi-output strategies (Console and File).
*   **[Rolling](logback-rolling/)**: File rotation policies (Size, Time, Fixed Window).
*   **[Filter](logback-filter/)**: Selective logging using `ThresholdFilter` and `LevelFilter`.
*   **[Context](logback-context/)**: MDC (Mapped Diagnostic Context) for thread-safe session tracking.
*   **[Async](logback-async/)**: Non-blocking logging using `AsyncAppender` for high-performance apps.

### 🛠️ 3. Custom Extensions
Learn how to extend Logback for specific business needs:
*   **[Custom Logger](logback-custom-logger/)**: Specific configuration for custom packages.
*   **[Custom Appender](logback-custom-appender/)**: Implementing `AppenderBase`.
*   **[Custom Encoder](logback-custom-encoder/)**: Implementing `EncoderBase`.
*   **[Custom Layout](logback-custom-layout/)**: Implementing `LayoutBase`.
*   **[Custom Rolling](logback-custom-rolling/)**: Implementing custom triggering and rolling policies.
*   **[Custom Filter](logback-custom-filter/)**: Implementing custom `Filter` logic.

---

## ⚡ Cheatsheet
Need a quick reference for all configuration options?
Check out the **[Logback Configuration Cheatsheet](CHEATSHEET.md)** for a list of all built-in patterns, appenders, and filters.

---


## 🎨 Log Output Levels

| Level | Usage |
| :--- | :--- |
| **TRACE** | Extremely granular info (e.g., individual method calls). |
| **DEBUG** | Useful during development to diagnose issues. |
| **INFO** | Confirming that things are working as expected. |
| **WARN** | Indication of potential issues or unexpected paths. |
| **ERROR** | Serious issues that might prevent functionality. |

---

## ⚠️ Common Gotchas & Technical Insights

> [!IMPORTANT]
> **MDC & Thread Pools**: MDC is stored in `ThreadLocal`. If you use thread pools (Executors, Parallel Streams), MDC data will **leak** between tasks or be missing unless you explicitly propagate it.

- **`prudent` mode**: Setting `<prudent>true</prudent>` in `FileAppender` allows multiple JVMs to write to the same file safely, but it incurs a significant performance penalty (approx 3x slower).
- **`includeCallerData`**: In `AsyncAppender`, setting this to `true` is extremely slow because it requires a stack trace snapshot for every log event.
- **`totalSizeCap`**: This property in `RollingFileAppender` is only checked *after* `maxHistory` processing. It doesn't guarantee the disk will never exceed this limit during a burst of logs.

---

## ✅ Production Checklist
Before deploying your Logback configuration:
- [ ] **Level Check**: Ensure `root` level is `INFO` or `WARN` in production.
- [ ] **Async Logging**: Use `AsyncAppender` for high-throughput applications to prevent blocking.
- [ ] **Retention Policy**: Always set `maxHistory` and `totalSizeCap` to prevent disk-full incidents.
- [ ] **Encoding**: Use `UTF-8` explicitly in your encoders to avoid encoding issues across different OS.
- [ ] **Additivity**: Check if you have duplicate logs in your files caused by parent-child appender inheritance.

---

## 🚀 Getting Started

### Prerequisites
- JDK 21+
- Gradle (provided wrapper)

### Run an Example
Navigate to any module and run:
```bash
./gradlew :<module-name>:run
```
Example:
```bash
./gradlew :logback-rolling:run
```

---

## 📂 Project Structure

```text
.
├── logback-basic/           # Basic configuration
├── logback-logger/          # Logger levels & packages
├── logback-appender/        # File & Console destinations
├── logback-rolling/         # Standard rotation policies
├── logback-filter/          # Standard filtering
├── logback-context/         # MDC & Context properties
├── logback-async/           # Asynchronous appenders
├── logback-custom-*         # Custom component implementations
├── build.gradle.kts         # Root build configuration
└── gradle/
    └── libs.versions.toml   # Version management
```

---

## 🛡️ License
Released under the [MIT License](LICENSE).

---
*Crafted with ❤️ for the Java community.*