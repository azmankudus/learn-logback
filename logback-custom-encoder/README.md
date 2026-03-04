<a id="top"></a>
<a href="../README.md" style="float: right;">Direct back to main</a>

# 🛠️ Logback Custom Encoder

Discover how to transform logging events into **Byte Streams**!

---

## 📑 Table of Contents
- <a href="#learning-objective">🎯 Learning Objective</a>
- <a href="#key-facts">💡 Key Facts</a>
- <a href="#implementation">🧪 Implementation Detail</a>
- <a href="#run-example">🚀 Run the Example</a>

---

<a id="learning-objective"></a>
## 🎯 Learning Objective <a href="#top" style="float: right;">🔝</a>
In this module, you will learn how to build a custom encoder. You will master:
- **EncoderBase**: The foundation for all Logback encoders.
- **Byte Array Management**: Working with character sets.
- **Headers & Footers**: Adding framing to your log output.

---

<a id="key-facts"></a>
## 💡 Key Facts <a href="#top" style="float: right;">🔝</a>
1.  **Byte Streams**: Encoders manage the lifecycle of the output stream.
2.  **Stateful**: Encoders can maintain state between events for aggregation.
3.  **Performance**: Custom encoders are great for binary formats.

---

<a id="implementation"></a>
## 🧪 Implementation Detail <a href="#top" style="float: right;">🔝</a>
-   **Class**: `UpperCustomEncoder`
-   **Purpose**: Shout everything in **UPPERCASE** with a session header.
-   **Example Output**:
    ```text
    --- LOG SESSION START ---
    MAIN CLASS STARTING...
    HELLO WORLD FROM LOGBACK!
    --- LOG SESSION END ---
    ```

---

<a id="run-example"></a>
## 🚀 Run the Example <a href="#top" style="float: right;">🔝</a>
```bash
./gradlew :logback-custom-encoder:run
```

---
*Next Step: Explore [Custom Layout](../logback-custom-layout/) to learn how to format your strings!*
