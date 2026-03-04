# 🧠 Logback Context (MDC)

Master the power of **Context-Aware Logging**!

## 🎯 Learning Objective
In this module, you will learn how to enrich your logs with dynamic data that isn't hardcoded in the message. You will master:
- **MDC (Mapped Diagnostic Context)**: Thread-local storage for logging variables.
- **Variable Patterns**: Using `%X{key}` to display context data.
- **Default Values**: Providing fallbacks (e.g. `:-anonymous`) when a key is missing.

## 💡 Key Facts
1.  **Thread Local**: MDC is based on `ThreadLocal`. Any data put into MDC by a thread will be available to all loggers called *within that same thread*.
2.  **Context Leakage**: It is **critical** to call `MDC.clear()` or `MDC.remove(key)` in a `finally` block to prevent data from "leaking" into other tasks if the thread is reused (e.g. in a thread pool).
3.  **Appender Access**: MDC data is sent to *all* appenders. You can even use MDC data to route logs to different files using a `SiftingAppender`.

> [!TIP]
> **SiftingAppender**: Use this to dynamically create new appenders based on MDC values. For example, you can create a separate log file for each **User ID** or **Tenant ID** automatically!

## 🧪 Scenario Demonstrated
We simulate a user transaction:
1.  A **User ID** and **Transaction ID** are generated and put into MDC.
2.  Multiple methods are called. Even though we don't pass the IDs as arguments, the logger can still "see" them and print them.
3.  The IDs are cleared once the transaction finished.
4.  Logs outside the transaction show up as `[User: anonymous] [Tx: none]`.

## 🚀 Run the Example
```bash
./gradlew :logback-context:run
```

---
*Next Step: Dive into [Custom Components](../logback-custom-logger/) to build your own Logback extensions!*
