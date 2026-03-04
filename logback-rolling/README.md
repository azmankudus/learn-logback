<a id="top"></a>
<a href="../README.md" style="float: right;">Direct back to main</a>

# 🌀 Logback Rolling

Master the art of **Log Rotation** and **History Management**!

---

## 📑 Table of Contents
- <a href="#learning-objective">🎯 Learning Objective</a>
- <a href="#key-facts">💡 Key Facts</a>
- <a href="#policies">🔄 Policies Demonstrated</a>
- <a href="#run-example">🚀 Run the Example</a>

---

<a id="learning-objective"></a>
## 🎯 Learning Objective <a href="#top" style="float: right;">🔝</a>
In this module, you will learn how to prevent log files from growing indefinitely and taking over your disk space. You will master:
- **RollingFileAppender**: The base appender for rotating files.
- **TimeBasedRollingPolicy**: Automatic rotation based on time (e.g., daily).
- **SizeAndTimeBasedRollingPolicy**: Rotation based on both file size and time.
- **FixedWindowRollingPolicy**: A simple indexing-based rotation strategy.

---

<a id="key-facts"></a>
## 💡 Key Facts <a href="#top" style="float: right;">🔝</a>
1.  **File Naming**: The `fileNamePattern` is crucial. It determines the rollover period based on the date tokens provided (e.g., `yyyy-MM-dd` for daily, `yyyy-MM` for monthly).
2.  **Compression**: If the `fileNamePattern` ends with `.gz` or `.zip`, Logback will automatically compress your archived logs!
3.  **Active File**: The `file` property specifies the *currently active* log file. When a rollover occurs, the active file is renamed/moved to the archived location.

> [!TIP]
> **Startup Cleanup**: Set `<cleanHistoryOnStart>true</cleanHistoryOnStart>` within your rolling policy to ensure old files are cleaned up as soon as the application starts.

---

<a id="policies"></a>
## 🔄 Policies Demonstrated <a href="#top" style="float: right;">🔝</a>
-   **Size & Time**: The most common production strategy. "Keep 30 days of logs, roll every 10MB, cap total size at 100MB."
-   **Time Only**: Simpler strategy for low-volume logs. "Roll every night at midnight."
-   **Fixed Window**: Classic approach. Use `log.1`, `log.2`, etc.

---

<a id="run-example"></a>
## 🚀 Run the Example <a href="#top" style="float: right;">🔝</a>
```bash
./gradlew :logback-rolling:run
```

---
*Next Step: Explore [Logback Filter](../logback-filter/) to learn how to discard unwanted logs!*
