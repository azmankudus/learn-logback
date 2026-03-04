# 🏷️ Logback Markers

Master **SLF4J Markers** for enhanced log filtering and event tagging!

## 🎯 Learning Objective
In this module, you'll learn how to use Markers to tag individual log events, allowing for specialized processing and filtering that goes beyond simple log levels or package names. You will master:
- Creating and using **SLF4J Markers**.
- The `%marker` conversion word in pattern layouts.
- **MarkerFilter**: Accepting or denying logs based on specific markers.

## 💡 Key Facts
1.  **Event Tagging**: Markers are objects used to "tag" logging requests. They provide a powerful way to categorize logs across different parts of your application.
2.  **Hierarchical**: Markers can have children, allowing for hierarchical tagging (e.g., `INTERNAL` could be a parent of `DATABASE`).
3.  **Appender Agnostic**: Like Levels, Markers are part of the logging event and can be used by any appender or filter.

## 🚀 Run the Example
```bash
./gradlew :logback-markers:run
```

---
*Next Step: Explore [Logback Condition](../logback-condition/) to learn about environment-specific configurations!*
