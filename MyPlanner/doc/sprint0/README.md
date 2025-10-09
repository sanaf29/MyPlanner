# 🗓️ MyPlanner

### A simple, structured, and personal weekly planner — built in Java.

---

## 📘 Overview
**MyPlanner** is a lightweight weekly scheduling and productivity tool designed to help students and professionals stay organized.  
It allows users to **add, edit, and track daily events and tasks**, view weekly summaries, and measure progress — all through a clean, offline console-based interface.



---

## 🚀 Motivation
Modern planning tools like Google Calendar and Notion often feel overwhelming for users who just want a simple, personal planner.  
**MyPlanner** bridges that gap by offering:
- A **clear weekly overview** of events and tasks.
- **Offline usability** — no accounts or internet required.
- A **minimalist console interface** for quick, focused productivity.

It’s ideal for:
- Students managing lectures, labs, and assignments.  
- Developers or interns planning daily tasks within sprints.  
- Anyone who wants lightweight structure without distractions.

---

## 🧩 Features
| Category | Description |
|-----------|--------------|
| ✅ **Task Management** | Add, edit, mark complete, and delete weekly tasks. |
| 📅 **Event Scheduling** | Add events with specific times and descriptions. |
| 📊 **Summary Reports** | View total tasks, completion rate, and day-by-day breakdowns. |
| 🧠 **Custom Data Structure** | Uses a self-implemented `SinglyLinkedList` for event handling. |
| ⚙️ **Error Handling** | Detects invalid weekdays via `UnexpectedWeekDay` exception. |
| 💾 **Persistence (Upcoming)** | Future enhancement — save planner data locally. |

---

## 🏗️ Architecture
MyPlanner follows the **MVC (Model–View–Controller)** pattern.

| Layer | Classes | Responsibility |
|--------|----------|----------------|
| **Model** | `Day`, `Event`, `Task`, `SinglyLinkedList`, `UnexpectedWeekDay` | Core data and logic. |
| **Controller** | To be added in Sprint 1. | Handles user input and flow. |
| **View** | Console-based interface. | Displays weekly planner output. |

---

## 📁 Folder Structure
