<a id="top"></a>
<a href="../README.md" style="float: right;">Direct back to main</a>

# 🧠 Logback Context (MDC)

Master the power of **Context-Aware Logging**!

---

## 📑 Table of Contents
- <a href="#learning-objective">🎯 Learning Objective</a>
- <a href="#key-facts">💡 Key Facts</a>
- <a href="#scenario">🧪 Scenario Demonstrated</a>
- <a href="#run-example">🚀 Run the Example</a>

---

<a id="learning-objective"></a>
## 🎯 Learning Objective <a href="#top" style="float: right;">🔝</a>
In this module, you will learn how to enrich your logs with dynamic data that isn't hardcoded in the message. You will master:
- **MDC (Mapped Diagnostic Context)**: Thread-local storage for logging variables.
- **Variable Patterns**: Using `%X{key}` to display context data.
- **Default Values**: Providing fallbacks (e.g. `:-anonymous`) when a key is missing.

---

<a id="key-facts"></a>
## 💡 Key Facts <a href="#top" style="float: right;">🔝</a>
1.  **Thread Local**: MDC is based on `ThreadLocal`. Any data put into MDC by a thread will be available to all loggers called *within that same thread*.
2.  **Context Leakage**: It is **critical** to call `MDC.clear()` or `MDC.remove(key)` in a `finally` block to prevent data from "leaking" into other tasks.
3.  **Appender Access**: MDC data is sent to *all* appenders.

> [!TIP]
> **SiftingAppender**: Use this to dynamically create new appenders based on MDC values. For example, you can create a separate log file for each **User ID** or **Tenant ID** automatically!

---

<a id="scenario"></a>
## 🧪 Scenario Demonstrated <a href="#top" style="float: right;">🔝</a>
We simulate a user transaction:
1.  **User ID** and **Transaction ID** are generated and put into MDC.
2.  Methods are called without passing identification.
3.  MDC data is cleared upon transaction completion.
4.  Logs outside the transaction show up as `[User: anonymous] [Tx: none]`.

---

<a id="run-example"></a>
## 🚀 Run the Example <a href="#top" style="float: right;">🔝</a>
```bash
./gradlew :logback-context:run
```

---
*Next Step: Dive into [Custom Components](../logback-custom-logger/) to build your own Logback extensions!*
