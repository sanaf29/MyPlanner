# Product Backlog – MyPlanner

This Product Backlog outlines all user stories for **MyPlanner**, a Java-based weekly planner app.  
The backlog follows Agile conventions — each story is written in the format:

> As a [type of user], I want [goal] so that [reason/benefit].

---

## 🧩 1. Core Features (High Priority)

### Story 1 — Create a Task
**As a** user,  
**I want** to create a new task with a title, due day, and optional description,  
**so that** I can keep track of what I need to do this week.  

**Acceptance Criteria:**
- User can input a task name and select a day of the week.
- Task appears in that day’s task list.
- Each task has an auto-assigned unique ID.

---

### Story 2 — Mark Task as Complete
**As a** user,  
**I want** to mark a task as “done”,  
**so that** I can visually see my progress.

**Acceptance Criteria:**
- Completed tasks show a “✔” symbol or status = “Done”.
- Status persists when displaying the weekly view.

---

### Story 3 — Edit a Task
**As a** user,  
**I want** to modify a task’s name or due day,  
**so that** I can correct mistakes or reschedule it.

**Acceptance Criteria:**
- Existing task data can be updated and re-stored in the correct list.
- Updated fields overwrite old values without creating duplicates.

---

### Story 4 — Delete a Task
**As a** user,  
**I want** to remove a completed or unnecessary task,  
**so that** my planner stays clean.

**Acceptance Criteria:**
- Deleted tasks disappear from the list immediately.
- The system confirms deletion in the console.

---

### Story 5 — Add an Event
**As a** user,  
**I want** to add an event with a name, date, start time, and end time,  
**so that** I can track meetings, classes, and appointments.

**Acceptance Criteria:**
- Event details are stored in a linked list under the correct day.
- Overlapping times are allowed but logged with a warning.

---

### Story 6 — Edit or Delete an Event
**As a** user,  
**I want** to modify or delete existing events,  
**so that** I can adjust my schedule easily.

**Acceptance Criteria:**
- Updated event reflects changes in title/time.
- Deletion removes the event node from the linked list.

---

## 📆 2. Viewing & Summaries (Medium Priority)

### Story 7 — Display All Tasks and Events by Day
**As a** user,  
**I want** to view all items for a selected day,  
**so that** I can quickly see my schedule.

**Acceptance Criteria:**
- Displays all tasks and events grouped under the selected weekday.
- Shows total counts and status breakdowns.

---

### Story 8 — Weekly Overview
**As a** user,  
**I want** to see my entire week at a glance,  
**so that** I can understand my workload balance.

**Acceptance Criteria:**
- Weekly summary prints each day name with number of tasks/events.
- Completed tasks are summarized per day.

---

### Story 9 — Summary of Progress
**As a** user,  
**I want** a summary of total tasks and how many are completed,  
**so that** I can measure my productivity.

**Acceptance Criteria:**
- Displays: total tasks, completed, and percentage done.
- Works dynamically as new tasks are added or completed.

---

## 💾 3. Data & Storage (Medium Priority)

### Story 10 — Save Planner Data Locally
**As a** user,  
**I want** my tasks and events to be saved locally,  
**so that** I don’t lose my progress when I close the app.

**Acceptance Criteria:**
- Data saved in a text or serialized file.
- Automatically loaded on restart.

---

### Story 11 — Reset Planner
**As a** user,  
**I want** to reset my planner at the end of the week,  
**so that** I can start fresh for the next one.

**Acceptance Criteria:**
- Clears all lists after user confirmation.
- Does not crash if planner is already empty.

---

## ⚙️ 4. Interaction & Usability (Lower Priority)

### Story 12 — Input Validation
**As a** user,  
**I want** the app to validate input (e.g., weekday spelling),  
**so that** I don’t accidentally enter invalid data.

**Acceptance Criteria:**
- Throws `UnexpectedWeekDay` exception for invalid day names.
- Prints helpful error messages.

---

### Story 13 — Display Help Menu
**As a** user,  
**I want** to see available commands and examples,  
**so that** I can learn how to use the planner easily.

**Acceptance Criteria:**
- Typing “help” displays all command formats.
- Available any time during program runtime.

---

### Story 14 — Sort Tasks by Status
**As a** user,  
**I want** to list pending tasks before completed ones,  
**so that** I can focus on unfinished work.

**Acceptance Criteria:**
- Sorting method reorganizes the linked list or arraylist view.
- Maintains data consistency.

---

## 🧑‍💻 5. Developer / Architecture Stories

### Story 15 — Implement Custom Linked List for Events
**As a** developer,  
**I want** to use a custom `SinglyLinkedList` class,  
**so that** I can practice implementing data structures manually.

**Acceptance Criteria:**
- Linked list supports `add`, `remove`, and `display` operations.
- Used exclusively for managing events in each `Day`.

---

### Story 16 — Build MVC Architecture
**As a** developer,  
**I want** the system separated into model, view, and controller packages,  
**so that** the code is modular and maintainable.

**Acceptance Criteria:**
- Model: Day, Task, Event classes  
- Controller: handles user input  
- View: console outputs  

---

## 🔚 6. Future / Stretch Stories

### Story 17 — Color-Coded Console Output
**As a** user,  
**I want** different colors for completed vs pending tasks,  
**so that** the console view is easier to read.

### Story 18 — Export Weekly Summary
**As a** user,  
**I want** to export my weekly summary to a text file,  
**so that** I can save it or print it.

---

## ✅ Definition of Done (for each story)
- Implemented and tested successfully.  
- Console output verified.  
- No compilation errors or major logic bugs.  
- Pushed to GitHub with descriptive commit message.  
