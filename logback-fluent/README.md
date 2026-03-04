# 🪄 Logback Fluent API

Master the modern way of logging with the **SLF4J 2.0+ Fluent API**!

## 🎯 Learning Objective
In this module, you'll learn how to use the modern, type-safe, and highly readable Fluent API for logging. You will master:
- Using `logger.atInfo()`, `logger.atDebug()`, etc.
- Passing arguments with `addArgument()`.
- Handling exceptions with `setCause()`.
- Logging with key-value pairs (KeyValuePairs).

## 💡 Key Facts
1.  **SLF4J 2.0+ Required**: Fluent API is available from SLF4J 2.0 onwards. Logback 1.3+ and 1.4+ support this.
2.  **Increased Readability**: No more long strings of arguments! The fluent methods clearly show what is being logged and why.
3.  **Lazy Evaluation**: Like parameterized logging, arguments are only evaluated if the log level is enabled.
4.  **Key-Value Support**: You can easily add structured data using `addKeyValue("key", "value")`, which is extremely helpful for log analysis tools (e.g., ELK stack).

## 🚀 Run the Example
```bash
./gradlew :logback-fluent:run
```

---
*Back to [Main README](../README.md)*
