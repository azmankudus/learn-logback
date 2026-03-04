<a id="top"></a>
# ⚡ Logback Configuration Cheatsheet

A comprehensive reference for Logback configuration elements, conversion patterns, and built-in components.

---

## 📑 Table of Contents
- <a href="#core-attributes">⚡ Core Configuration Attributes</a>
- <a href="#layout-patterns">🎨 Layout Patterns</a>
- <a href="#appenders">🛠️ Built-in Appenders</a>
- <a href="#rolling-policies">📜 Rolling Policies</a>
- <a href="#encoders">🏗️ Encoders</a>
- <a href="#triggering-policies">⏱️ Triggering Policies</a>
- <a href="#filters">🔍 Filters</a>
- <a href="#conditional-logic">🔀 Conditional Logic</a>
- <a href="#log-levels">🌓 Log Levels</a>
- <a href="#quick-tips">💡 Quick Tips</a>

---

<a id="core-attributes"></a>
## ⚡ Core Configuration Attributes <a href="#top" style="float: right;">🔝</a>
Added to the root `<configuration>` tag.

| Attribute | Description | Example |
| :--- | :--- | :--- |
| `scan` | If `true`, Logback will scan for changes in the config file. | `scan="true"` |
| `scanPeriod` | How often to scan (default 1 minute). | `scanPeriod="30 seconds"` |
| `debug` | If `true`, prints Logback internal status during startup. | `debug="true"` |

---

<a id="layout-patterns"></a>
## 🎨 Layout Patterns (Conversion Specifiers) <a href="#top" style="float: right;">🔝</a>
Used in `<pattern>` strings within encoders.

| Specifier | Name | Performance | Description |
| :--- | :--- | :--- | :--- |
| `%d`, `%date` | Date | Moderate | Date/time of the event. Supports `{pattern}` (e.g., `%d{HH:mm:ss}`). |
| `%level`, `%p`, `%le`| Level | Very Low | Log level (ERROR, WARN, INFO, DEBUG, TRACE). |
| `%logger`, `%lo`, `%c` | Logger | Low | Name of the logger. Supports `{length}` for abbreviation. |
| `%msg`, `%m`, `%message`| Message | Very Low | Application-supplied log message. |
| `%thread`, `%t` | Thread | Low | Name of the thread that generated the log. |
| `%n` | New Line | Very Low | Platform-specific line separator (`\n` or `\r\n`). |
| `%ex`, `%exception` | Exception| High | Stack trace of the exception. Captured only if available. |
| `%relative`, `%r` | Relative | Very Low | Milliseconds since application start. |
| `%L`, `%line` | Line | **Very High** | Line number where log request was issued (Slow!). |
| `%C`, `%class` | Class | **Very High** | Fully qualified class name of the caller (Slow!). |
| `%M`, `%method` | Method | **Very High** | Method name from which log was issued (Slow!). |
| `%marker` | Marker | Low | The marker (tag) associated with the log event. |
| `%kvp` | Key-Value Pair | Low | The key-value pairs associated with the event (SLF4J 2.0+). |
| `%X`, `%mdc` | MDC | Low | Mapped Diagnostic Context value: `%X{key}`. |
| `%highlight(...)` | Highlight | Moderate | Formats color according to level (ERROR=red, etc.). |
| `%cyan(...)`, etc. | Color | Low | Colors text inside parentheses (e.g., `%cyan(%logger)`). |

---

<a id="appenders"></a>
## 🛠️ Built-in Appenders <a href="#top" style="float: right;">🔝</a>
Appenders are responsible for writing log events to different destinations.

### 1. `ConsoleAppender`
Outputs to `System.out` (default) or `System.err`.
- **Properties**:
    - `<withJansi>`: `true` to enable ANSI color support on Windows.
    - `<target>`: `System.out` or `System.err`.

### 2. `FileAppender`
Writes logs to a specific file.
- **Properties**:
    - `<file>`: Path to the log file (e.g., `logs/app.log`).
    - `<append>`: `true` (default) to append to the file; `false` to truncate.
    - `<prudent>`: `true` for safe writing from multiple JVMs (slower).

### 3. `RollingFileAppender`
Extends `FileAppender` with the ability to roll over log files.
- **Components**:
    - `<rollingPolicy>`: Determines "how" to roll (e.g., `TimeBasedRollingPolicy`).
    - `<triggeringPolicy>`: Determines "when" to roll (e.g., `SizeBasedTriggeringPolicy`).

### 4. `SyslogAppender`
Sends logs to a remote syslog daemon.
- **Properties**:
    - `<syslogHost>`: Hostname of the syslog server.
    - `<facility>`: Facility string (e.g., `USER`, `LOCAL0`).
    - `<suffixPattern>`: Pattern for the message part.

### 5. `SiftingAppender`
Dynamically creates appenders based on a runtime attribute (usually from MDC).
- **Properties**:
    - `<discriminator>`: Defines the key to sift by (e.g., `userId`).
    - `<sift>`: Contains the template appender (e.g., a `FileAppender` per user).

### 6. `SocketAppender` / `SSLServerSocketAppender`
Sends logging events to a remote server over TCP.
- **Properties**:
    - `<remoteHost>`: Target server hostname.
    - `<port>`: Target server port.
    - `<reconnectionDelay>`: Delay before attempting to reconnect on failure.

---

<a id="rolling-policies"></a>
## 📜 Rolling Policies <a href="#top" style="float: right;">🔝</a>
Used within `RollingFileAppender`.

| Policy | Description | Key Properties |
| :--- | :--- | :--- |
| `TimeBasedRollingPolicy` | Rolls based on time (daily, monthly, etc.). | `fileNamePattern` (required), `maxHistory`, `totalSizeCap`, `cleanHistoryOnStart` |
| `SizeAndTimeBasedRollingPolicy` | Rolls on time AND if file reaches a certain size. | `fileNamePattern`, `maxFileSize`, `maxHistory`, `totalSizeCap` |
| `FixedWindowRollingPolicy` | Rolls based on a fixed window index. | `minIndex`, `maxIndex`, `fileNamePattern` |

---

<a id="encoders"></a>
## 🏗️ Encoders <a href="#top" style="float: right;">🔝</a>
Encoders transform logging events into byte arrays.

| Class | Description | Key Properties |
| :--- | :--- | :--- |
| `PatternLayoutEncoder` | The standard encoder for using pattern strings. | `<pattern>`, `<outputPatternAsHeader>`, `<charset>` |
| `LayoutWrappingEncoder` | Wraps older Layout implementations (like `HTMLLayout`). | `<layout>` |

---

<a id="triggering-policies"></a>
## ⏱️ Triggering Policies <a href="#top" style="float: right;">🔝</a>
Used within `RollingFileAppender` to decide "when" to roll.

| Policy | Description | Key Properties |
| :--- | :--- | :--- |
| `SizeBasedTriggeringPolicy` | Rolls when the file reaches a certain size. | `<maxFileSize>` |
| `DefaultTimeBasedFileNamingAndTriggeringPolicy` | Part of `TimeBasedRollingPolicy` to allow size-based rolling within time periods. | `<maxFileSize>` |

---

<a id="filters"></a>
## 🔍 Filters <a href="#top" style="float: right;">🔝</a>
Filters allow you to decide whether a log event should be processed.

### Regular Filters (attached to Appenders)
- **`LevelFilter`**: Matches an exact level.
    - Properties: `<level>`, `<onMatch>`, `<onMismatch>`.
- **`ThresholdFilter`**: Filters events below a specified level.
    - Properties: `<level>`.
- **`MarkerFilter`**: Matches a specific SLF4J Marker.
    - Properties: `<marker>`, `<onMatch>`, `<onMismatch>`.
- **`EvaluatorFilter`**: Evaluates a Java expression (requires Janino).

### Turbo Filters (Logback Context wide)
- **`MDCFilter`**: Filters based on MDC values.
- **`MarkerFilter`**: Filters based on SLF4J Markers.
- **`DuplicateMessageFilter`**: Detects and suppresses repetitive messages.

---

<a id="conditional-logic"></a>
## 🔀 Conditional Logic <a href="#top" style="float: right;">🔝</a>
Requires the **Janino** library on the classpath.

```xml
<if condition='property("HOSTNAME").contains("prod")'>
  <then>
    <root level="INFO"><appender-ref ref="FILE" /></root>
  </then>
  <else>
    <root level="DEBUG"><appender-ref ref="CONSOLE" /></root>
  </else>
</if>
```

---

<a id="log-levels"></a>
## 🌓 Log Levels <a href="#top" style="float: right;">🔝</a>
Hierarchy (from highest to lowest):
1. `OFF`
2. `ERROR`
3. `WARN`
4. `INFO`
5. `DEBUG`
6. `TRACE`
7. `ALL`

---

<a id="quick-tips"></a>
## 💡 Quick Tips <a href="#top" style="float: right;">🔝</a>
- **Additivity**: By default, loggers inherit appenders from their parents. Set `<logger additivity="false">` to stop this behavior.
- **Strictness**: Use `<configuration debug="true">` at the root of `logback.xml` to see Logback's internal status logs during initialization.
- **Variables**: Use `${property_name}` to reference properties defined at the top of the file.
