<a id="top"></a>
<a href="../README.md" style="float: right;">Direct back to main</a>

# 🛠️ Logback Custom Logger

Learn how to configure specialized behavior for custom packages!

---

## 📑 Table of Contents
- <a href="#learning-objective">🎯 Learning Objective</a>
- <a href="#key-facts">💡 Key Facts</a>
- <a href="#scenario">🧪 Scenario Demonstrated</a>
- <a href="#run-example">🚀 Run the Example</a>

---

<a id="learning-objective"></a>
## 🎯 Learning Objective <a href="#top" style="float: right;">🔝</a>
In this module, you will learn how to isolate logs from a specific package and apply unique rules to them. You will master:
- **Logger Isolation**: Using `ALL` level for high-density debugging.
- **Additivity Control**: Preventing duplicate logs in the console.
- **Package-specific Appenders**: Routing specific package logs to dedicated destinations.

---

<a id="key-facts"></a>
## 💡 Key Facts <a href="#top" style="float: right;">🔝</a>
1.  **Logger Scope**: A logger named `dev.ayam.learn.logback.custom` only affects classes inside that package or its sub-packages.
2.  **Level Control**: Custom loggers can have a different level than the `root` logger.
3.  **Efficiency**: Configure specific loggers to reduce noise across the system.

---

<a id="scenario"></a>
## 🧪 Scenario Demonstrated <a href="#top" style="float: right;">🔝</a>
-   **Package Action**: `PackageCustomAction` emits logs at all levels.
-   **Root Masking**: The root logger only shows `INFO` and above for the system.
-   **Trace Visibility**: See `TRACE` and `DEBUG` messages from `PackageCustomAction` in the console.

---

<a id="run-example"></a>
## 🚀 Run the Example <a href="#top" style="float: right;">🔝</a>
```bash
./gradlew :logback-custom-logger:run
```

---
*Next Step: Explore [Custom Appender](../logback-custom-appender/) to build your own log writer!*
