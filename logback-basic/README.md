# 🍼 Logback Basic

Welcome to the absolute starting point of your Logback journey!

## 🎯 Learning Objective
In this module, you'll master the foundational building blocks of logging in a Java application. You will learn:
- How to initialize an **SLF4J Logger**.
- The structure of a minimal `logback.xml` file.
- How to define and use **Properties**.
- The basics of the **Console Appender**.

## 💡 Key Facts
1.  **SLF4J Abstraction**: We never use Logback classes directly in our Java code. Instead, we use the SLF4J API (`LoggerFactory.getLogger`). This allows us to swap logging implementations without changing code!
2.  **Configuration Search**: By default, Logback looks for `logback.xml` on the classpath. If not found, it tries `logback-test.xml` or falls back to a default configuration.
3.  **Root Logger**: Every configuration must have a `<root>` logger. It acts as the "parent" of all loggers and defines the default logging level.

> [!TIP]
> **Internal Debugging**: Statically troubleshooting Logback? Add `debug="true"` to your `<configuration>` tag to see Logback's internal status logs during startup. This is invaluable when your configuration isn't loading as expected!

## 🛠️ Components Used
-   **Logger**: The interface used by the application to request logging.
-   **Appender**: Responsible for writing the logging events (e.g., to the Console).
-   **Encoder**: Responsible for transforming a logging event into a byte array and formatting it according to a pattern.

## 🚀 Run the Example
```bash
./gradlew :logback-basic:run
```

---
*Next Step: Explore [Logback Logger](../logback-logger/) to learn about package-specific strictness!*
