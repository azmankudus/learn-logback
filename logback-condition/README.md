<a id="top"></a>
<a href="../README.md" style="float: right;">... back to main</a>

# 🔀 Logback Condition

Master **Conditional Configuration** for environment-specific logging!

---

## 📑 Table of Contents
- <a href="#learning-objective">🎯 Learning Objective</a>
- <a href="#key-facts">💡 Key Facts</a>
- <a href="#run-example">🚀 Run the Example</a>

---

<a id="learning-objective"></a>
## 🎯 Learning Objective <a href="#top" style="float: right;">🔝</a>
In this module, you'll adapt logging behavior based on the environment. You will master:
- Using `<if>`, `<then>`, and `<else>` tags.
- Integrating **Janino** for expression evaluation.
- Accessing system properties and environment variables.

---

<a id="key-facts"></a>
## 💡 Key Facts <a href="#top" style="float: right;">🔝</a>
1.  **Janino Dependency**: Required on the classpath for conditional logic.
2.  **Flexible Logic**: Use any valid Java expression in `condition`.
3.  **Dynamic Properties**: Check for properties, values, or complex boolean logic.

---

<a id="run-example"></a>
## 🚀 Run the Example <a href="#top" style="float: right;">🔝</a>
```bash
# Run with default (Development) settings
./gradlew :logback-condition:run

# Run simulating Production (using a system property)
./gradlew :logback-condition:run -DAPP_ENV=PROD
```

---
*Next Step: Check the [Cheatsheet](../CHEATSHEET.md) for a summary of all Logback features!*
