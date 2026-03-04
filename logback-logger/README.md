# 📦 Logback Logger

Master the art of **Hierarchical Logging**!

## 🎯 Learning Objective
In this module, you will learn how to configure different parts of your application with different logging strictness. You will master:
- **Logger Names**: Using package names as identifiers.
- **Hierarchy & Inheritance**: How children loggers interact with parents.
- **Level Precedence**: How a specific `<logger>` level overrides the `<root>` level.

## 💡 Key Facts
1.  **Named Loggers**: Loggers are named entities. Their names are case-sensitive and they follow the hierarchical naming rule (e.g., `a.b` is a parent of `a.b.c`).
2.  **Additivity**: By default, a logger will send its output to its own appenders AND to the appenders of its ancestors. This is called "Additivity". If you set `additivity="false"`, the chain is broken.
3.  **Root fallback**: If a logger isn't explicitly configured, it inherits the level of its nearest ancestor. Eventually, everything falls back to the `root` logger.

> [!TIP]
> **Performance Tip**: When possible, use **Class-level Loggers** (`LoggerFactory.getLogger(MyClass.class)`). It's a standard pattern that makes it easy to trace logs back to their source and allows for granular configuration at the class level if needed.

## 🏢 Business Case Example
In this project, we simulate three departments:
- **HR**: Requires stability, only logs `INFO` and above.
- **IT**: Needs troubleshooting data, logs `DEBUG`.
- **Sales**: Needs trace-level auditing for every transaction, logs `TRACE`.
- **System**: Everything else is set to `ERROR` to reduce noise.

## 🚀 Run the Example
```bash
./gradlew :logback-logger:run
```

---
*Next Step: Explore [Logback Appender](../logback-appender/) to learn about sending logs to files!*
