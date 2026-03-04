<a id="top"></a>
<a href="../README.md" style="float: right;">... back to main</a>

# 🛠️ Logback Custom Filter

Build your own **Log Gatekeeper**!

---

## 📑 Table of Contents
- <a href="#learning-objective">🎯 Learning Objective</a>
- <a href="#key-facts">💡 Key Facts</a>
- <a href="#implementation">🧪 Implementation Detail</a>
- <a href="#run-example">🚀 Run the Example</a>

---

<a id="learning-objective"></a>
## 🎯 Learning Objective <a href="#top" style="float: right;">🔝</a>
In this module, you will learn how to implement custom filtering logic. You will master:
- **Filter Interface**: Implementing the `decide()` method.
- **FilterReply**: Using `ACCEPT`, `DENY`, and `NEUTRAL`.
- **Content Filtering**: Inspecting message content.

---

<a id="key-facts"></a>
## 💡 Key Facts <a href="#top" style="float: right;">🔝</a>
1.  **Flexibility**: Custom filters can check APIs or inspect user context.
2.  **NEUTRAL is Key**: Allows subsequent filters to be consulted.
3.  **Metadata Access**: Receives `ILoggingEvent` with all metadata.

---

<a id="implementation"></a>
## 🧪 Implementation Detail <a href="#top" style="float: right;">🔝</a>
-   **Class**: `WordCustomFilter`
-   **Purpose**: Detect **forbidden words** (like `SECRET`) and prevent printing.

---

<a id="run-example"></a>
## 🚀 Run the Example <a href="#top" style="float: right;">🔝</a>
```bash
./gradlew :logback-custom-filter:run
```

---
*Congratulations! You've completed the Logback learning path!*
