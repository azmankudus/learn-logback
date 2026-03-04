# ⚡ Logback Async

Master high-performance logging with **Asynchronous Appenders**!

## 🎯 Learning Objective
In this module, you will learn how to prevent logging from slowing down your main application logic. You will master:
- **AsyncAppender**: A wrapper appender that uses a background thread.
- **Queue Management**: Configuring buffer sizes to handle log bursts.
- **Discarding Strategies**: Deciding when to drop logs to save the system.

## 💡 Key Facts
1.  **Blocking by Default**: Standard Logback appenders (Console, File) block the main application thread until the I/O operation is finished.
2.  **The Worker Pattern**: `AsyncAppender` receives events and puts them into a `BlockingQueue`. A dedicated worker thread then takes events from the queue and writes them to the underlying appender.
3.  **Lossy Logging**: By default, `AsyncAppender` will drop `TRACE`, `DEBUG`, and `INFO` events if the queue is more than 80% full. This is a safety mechanism to prevent the log system from crashing your app.

## ⚙️ Configuration Properties
-   **queueSize**: Default is 256. Higher values use more memory but handle larger bursts.
-   **discardingThreshold**: Percentage of the queue at which events are dropped. Set to `0` to never drop events (but this might eventually block the app).
-   **includeCallerData**: Setting this to `true` significantly degrades performance as it requires walking the stack.
-   **neverBlock**: (Advanced) If set to `true`, the `AsyncAppender` will **drop events** regardless of their level if the queue is full, ensuring the application thread is **never** blocked.

> [!WARNING]
> **Data Loss Risk**: `AsyncAppender` is a "lossy" appender. If business-critical logs (auditing, financial transactions) are logged via `AsyncAppender`, they might be lost during a burst if the queue is full.

## 🧪 Scenario Demonstrated
-   **Main Thread Performance**: We log 10,000 messages in a tight loop and measure the time.
-   **Background Processing**: Notice how the main thread finishes in milliseconds, while the console continues to update for several seconds as the worker thread catches up.

## 🚀 Run the Example
```bash
./gradlew :logback-async:run
```

---
*Next Step: Move on to custom extensions or explore [Logback Context](../logback-context/) for dynamic data!*
