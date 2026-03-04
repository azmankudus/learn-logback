# 🛠️ Logback Custom Rolling

Master the art of **Advanced File Rotation**!

## 🎯 Learning Objective
In this module, you will learn how to go beyond standard time and size triggers. You will master:
- **TriggeringPolicyBase**: The base class for custom rotation triggers.
- **Stateful Triggers**: Managing internal counters to decide when to roll.
- **Custom-Trigger + Standard-Policy**: Combining your custom logic with Logback's built-in file archiving.

## 💡 Key Facts
1.  **Trigger vs Rolling**: A **Triggering Policy** answers the question: "Should we roll now?". A **Rolling Policy** answers the question: "How should we rename the files?".
2.  **Generic Support**: `TriggeringPolicyBase<E>` allows you to inspect the log event (`E`) to make complex decisions (e.g., rolling when a specific keyword appears).
3.  **Active File**: Custom triggering policies still interact with the `activeFile` provided by the `RollingFileAppender`.

## 🧪 Implementation Detail
-   **Class**: `CountCustomTriggeringPolicy`
-   **Purpose**: To trigger a rollover every $N$ log messages, regardless of time or file size.
-   **Configuration**: We set `maxCount` to 5.
-   **Archive Strategy**: We use the standard `FixedWindowRollingPolicy` to keep a window of 3 archived files (`custom-rolling.1.log`, etc.).

## 🚀 Run the Example
```bash
./gradlew :logback-custom-rolling:run
```

---
*Next Step: Explore [Custom Filter](../logback-custom-filter/) to build your own log gatekeeper!*
