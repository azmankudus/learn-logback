<a id="top"></a>
<a href="../README.md" style="float: right;">... back to main</a>

# 🛠️ Logback Custom Layout

Learn how to create structured **String Outputs**!

---

## 📑 Table of Contents
- <a href="#learning-objective">🎯 Learning Objective</a>
- <a href="#key-facts">💡 Key Facts</a>
- <a href="#implementation">🧪 Implementation Detail</a>
- <a href="#run-example">🚀 Run the Example</a>

---

<a id="learning-objective"></a>
## 🎯 Learning Objective <a href="#top" style="float: right;">🔝</a>
In this module, you will learn how to build a custom layout. You will master:
- **LayoutBase**: The base class for all Logback layouts.
- **String Formatting**: Creating custom string representations.
- **LayoutWrappingEncoder**: How to use a Layout within an Encoder.

---

<a id="key-facts"></a>
## 💡 Key Facts <a href="#top" style="float: right;">🔝</a>
1.  **Layout vs Encoder**: Layout converts event to **String**, Encoder to **byte array**.
2.  **Stateless Utility**: Layouts focus solely on formatting logic.
3.  **Structured Logs**: Custom layouts are ideal for JSON or CSV formats.

---

<a id="implementation"></a>
## 🧪 Implementation Detail <a href="#top" style="float: right;">🔝</a>
-   **Class**: `JsonCustomLayout`
-   **Purpose**: Format log entries as single-line JSON objects.
-   **Example Output**:
    ```json
    {"service": "MyAwesomeService", "level": "INFO", "msg": "Main starting..."}
    ```

---

<a id="run-example"></a>
## 🚀 Run the Example <a href="#top" style="float: right;">🔝</a>
```bash
./gradlew :logback-custom-layout:run
```

---
*Next Step: Explore [Custom Rolling](../logback-custom-rolling/) to learn about advanced rotation triggers!*
