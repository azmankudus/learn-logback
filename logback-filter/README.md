# 🔍 Logback Filter

Master the art of **Selective Logging**!

## 🎯 Learning Objective
In this module, you will learn how to discard or keep specific log messages based on criteria other than just the package name. You will master:
- **ThresholdFilter**: Blocking logs below a certain level.
- **LevelFilter**: Exact level matching (ignoring higher levels too).
- **Filter Lifecycle**: `NEUTRAL`, `ACCEPT`, and `DENY` responses.

## 💡 Key Facts
1.  **Filter Reply**: A filter returns one of three values:
    - `DENY`: The event is skipped immediately.
    - `NEUTRAL`: The next filter in the chain (if any) is consulted. If no more filters, the event is processed.
    - `ACCEPT`: The event is processed immediately, skipping any remaining filters.
2.  **Appender Filters**: These filters are attached to a specific appender. They only affect that appender's output.
3.  **TurboFilters**: (Advanced) These are global and are called *before* the logging event is even created, making them highly performant.

## 🧪 Strategies Demonstrated
-   **High Transparency Root**: We set the root level to `ALL` to capture everything.
-   **Selective Console**: We use a `ThresholdFilter` to only show `WARN` and `ERROR` on the console, preventing information overload.
-   **Precision File**: We use a `LevelFilter` to capture **only** `INFO` logs in a specific file. Even `ERROR` logs are excluded from this file!

## 🚀 Run the Example
```bash
./gradlew :logback-filter:run
```

---
*Next Step: Explore [Logback Context](../logback-context/) to learn about thread-safe variable tracking!*
