# 🔀 Logback Condition

Master **Conditional Configuration** for environment-specific logging!

## 🎯 Learning Objective
In this module, you'll learn how to use conditional logic within your `logback.xml` to adapt your logging behavior based on the environment (e.g., Development vs. Production). You will master:
- Using `<if>`, `<then>`, and `<else>` tags.
- Integrating the **Janino** library for Java-based expression evaluation.
- Accessing system properties and environment variables in conditions.

## 💡 Key Facts
1.  **Janino Dependency**: Conditional processing requires the Janino library on the classpath.
2.  **Flexible Logic**: You can use any valid Java expression in the `condition` attribute of the `<if>` tag.
3.  **Dynamic Properties**: Conditions can check for the existence of properties, specific values, or even complex boolean logic.

## 🚀 Run the Example
```bash
# Run with default (Development) settings
./gradlew :logback-condition:run

# Run simulating Production (using a system property)
./gradlew :logback-condition:run -DAPP_ENV=PROD
```

---
*Next Step: Check the [Cheatsheet](../CHEATSHEET.md) for a summary of all Logback features!*
