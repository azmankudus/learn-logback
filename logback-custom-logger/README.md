# 🛠️ Logback Custom Logger

Learn how to configure specialized behavior for custom packages!

## 🎯 Learning Objective
In this module, you will learn how to isolate logs from a specific package and apply unique rules to them. You will master:
- **Logger Isolation**: Using `ALL` level for high-density debugging.
- **Additivity Control**: Preventing duplicate logs in the console.
- **Package-specific Appenders**: Routing specific package logs to dedicated destinations.

## 💡 Key Facts
1.  **Logger Scope**: A logger named `dev.ayam.learn.logback.custom` only affects classes inside that package or its sub-packages.
2.  **Level Control**: Even if the `root` logger is set to `INFO`, our custom logger is set to `ALL`, ensuring we see `TRACE` and `DEBUG` for our business logic.
3.  **Efficiency**: By configuring specific loggers, you can reduce noise across the system while keeping deep visibility where you need it most.

## 🧪 Scenario Demonstrated
-   **Package Action**: `PackageCustomAction` emits logs at all levels.
-   **Root Masking**: The root logger only shows `INFO` and above for the system.
-   **Trace Visibility**: Because of our custom logger configuration, we can see the `TRACE` and `DEBUG` messages from `PackageCustomAction` in the console.

## 🚀 Run the Example
```bash
./gradlew :logback-custom-logger:run
```

---
*Next Step: Explore [Custom Appender](../logback-custom-appender/) to build your own log writer!*
