# 🌀 Logback Rolling: Master the Archives 📦

Welcome to the **Logback Rolling Policy** module! This project will teach you how to manage log files so they don't consume all your disk space.

---

## 🏗️ What is Log Rolling?

In production, log files can grow infinitely. To prevent this, **Log Rolling** is the process where the current log file is archived when a certain limit is reached.

---

## 🛠️ Exploring the `RollingPolicy`

We've configured the highly advanced `SizeAndTimeBasedRollingPolicy`:

### 1. Daily Rotation (`%d{yyyy-MM-dd}`)
Each new day, a new log file is created automatically.
*   **Archiving**: Old files are moved to the `logs/archived/` folder to keep the main directory clean.

### 2. Multi-Part Split (`%i`)
If a log file exceeds its specified size limit (e.g., 10MB) *within the same day*, it's split into multiple parts (part 0, part 1, and so on).
*   **Key setting**: `<maxFileSize>10KB</maxFileSize>` (it's set very small here just to show you the power!).

### 3. History Management
Old records shouldn't stay forever.
*   `<maxHistory>60</maxHistory>` - Keep 60 days of history.
*   `<totalSizeCap>100MB</totalSizeCap>` - Limit the total archive size. Logback will delete the oldest logs first to stay under this cap.

---

## 🚀 Lab: Watch the Roll!

1. Run the application:
   ```bash
   cd logback-rolling && ./gradlew run
   ```
2. Check your project folder. You should see `logs/rolling.log`.
3. Open the **`logs/archived/`** directory.
4. You should see a list of files like this:
   ```bash
   rolling.2026-03-04.0.log
   rolling.2026-03-04.1.log
   ...
   ```

---
*Keep your logs, save your storage!* 🪵
