<a id="top"></a>
<a href="../README.md" style="float: right;">... back to main</a>

# 🔍 Logback Filter

Master the art of **Selective Logging**!

---

## 📑 Table of Contents
- <a href="#learning-objective">🎯 Learning Objective</a>
- <a href="#key-facts">💡 Key Facts</a>
- <a href="#strategies">🧪 Strategies Demonstrated</a>
- <a href="#run-example">🚀 Run the Example</a>

---

<a id="learning-objective"></a>
## 🎯 Learning Objective <a href="#top" style="float: right;">🔝</a>
In this module, you will learn how to discard or keep specific log messages based on criteria other than just the package name. You will master:
- **ThresholdFilter**: Blocking logs below a certain level.
- **LevelFilter**: Exact level matching (ignoring higher levels too).
- **Filter Lifecycle**: `NEUTRAL`, `ACCEPT`, and `DENY` responses.

---

<a id="key-facts"></a>
## 💡 Key Facts <a href="#top" style="float: right;">🔝</a>
1.  **Filter Reply**: A filter returns one of three values:
    - `DENY`: The event is skipped immediately.
    - `NEUTRAL`: The next filter in the chain (if any) is consulted.
    - `ACCEPT`: The event is processed immediately.
2.  **Appender Filters**: These filters are attached to a specific appender. They only affect that appender's output.
3.  **TurboFilters**: (Advanced) These are global and are called *before* the logging event is even created.

---

<a id="strategies"></a>
## 🧪 Strategies Demonstrated <a href="#top" style="float: right;">🔝</a>
-   **High Transparency Root**: Capture everything at the root level.
-   **Selective Console**: Use `ThresholdFilter` to only show `WARN` and `ERROR`.
-   **Precision File**: Use `LevelFilter` to capture **only** `INFO` logs.

---

<a id="run-example"></a>
## 🚀 Run the Example <a href="#top" style="float: right;">🔝</a>
```bash
./gradlew :logback-filter:run
```

---
*Next Step: Explore [Logback Context](../logback-context/) to learn about thread-safe variable tracking!*
