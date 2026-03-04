# 🛠️ Logback Custom Filter

Build your own **Log Gatekeeper**!

## 🎯 Learning Objective
In this module, you will learn how to implement custom filtering logic based on business requirements. You will master:
- **Filter Interface**: Implementing the `decide()` method.
- **FilterReply**: Using `ACCEPT`, `DENY`, and `NEUTRAL`.
- **Content Filtering**: Inspecting the message content to make decisions.

## 💡 Key Facts
1.  **Flexibility**: Custom filters can do anything: check remote APIs, inspect the current user context, or scan for sensitive keywords.
2.  **NEUTRAL is Key**: Returning `NEUTRAL` is often better than `ACCEPT` because it avoids overriding subsequent filters in the chain.
3.  **Inheritance**: The custom filter receives the `ILoggingEvent` object, which contains all the metadata about the log call (level, logger name, thread, MDC, etc.).

## 🧪 Implementation Detail
-   **Class**: `WordCustomFilter`
-   **Purpose**: To detect specific **forbidden words** (like `SECRET`) and prevent them from being printed to the console.
-   **Configuration**: The forbidden word is set via the `<word>` element in `logback.xml`.

## 🚀 Run the Example
```bash
./gradlew :logback-custom-filter:run
```

---
*Congratulations! You've completed the Logback learning path!*
