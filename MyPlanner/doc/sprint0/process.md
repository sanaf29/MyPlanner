# Process Reflection – Sprint 0

## Overview
This document describes the workflow and organizational process followed while developing **MyPlanner**, a weekly planner application built in Java.  
As a solo developer, I approached this project with an Agile mindset, adapting Scrum practices such as sprints, backlog management, and incremental development.

---

## Team Organization
Although this project is completed individually, I still followed Agile roles conceptually:
- **Product Owner / Developer:** Myself — responsible for defining user stories and ensuring progress aligns with the project vision.
- **Scrum Master (self-managed):** Ensured each Sprint had achievable goals and deadlines, with regular progress check-ins.

Key organizational actions:
- Created `doc/sprint0` folder for all planning artifacts.
- Defined clear tasks in `PB.md` (Product Backlog).
- Planned incremental implementation (Sprint 1 → core features, Sprint 2 → storage/UI, Sprint 3 → final polish).

---

## Tools Used
| Tool | Purpose |
|------|----------|
| **Eclipse IDE / VS Code** | Writing and testing Java classes |
| **Git + GitHub** | Version control, commits, and documentation backup |
| **Trello (optional)** | Organizing backlog and progress tracking |
| **Markdown / PDF** | Sprint 0 documentation and persona creation |

---

## Decision-Making Process
All project design decisions were guided by **simplicity**, **maintainability**, and **clarity**:
- Chose **Java (OOP)** to demonstrate understanding of encapsulation and custom data structures.
- Selected the **MVC architecture** for scalability and readability.
- Used **SinglyLinkedList** instead of Java’s built-in lists to practice manual data structure design.

Each decision was documented immediately in the backlog or source files, ensuring traceability of design choices.

---

## Prioritization of User Stories
- **High Priority:** Core planner operations (add/edit/delete tasks/events).
- **Medium Priority:** Viewing summaries and saving data.
- **Low Priority:** Aesthetic and extended functionality (color output, export features).

Stories were ranked based on their value to the main user goal — managing weekly organization efficiently.

---

## Meeting & Review Process
Since this is an independent project:
- Replaced daily stand-ups with **personal progress logs** written after each coding session.
- Conducted **weekly self-reviews** to assess completed features and bugs.
- Used Git commit history as an automatic record of progress.

Example routine:
> Review previous day’s work → identify blockers → fix or re-plan → commit progress.

---

## Lessons Learned
- Setting up a clear **folder and file structure** early prevents confusion later in development.
- Maintaining consistent commit messages (e.g., “Added addEvent method to Day.java”) simplifies tracking.
- Breaking large tasks into smaller user stories improves productivity.
- Documentation and planning (Sprint 0) are just as important as coding for long-term clarity.

---

## Next Steps
For **Sprint 1**, the goal is to:
1. Implement core Java classes (`Day`, `Task`, `Event`).
2. Integrate logic between daily tasks/events.
3. Begin minimal console interface for user interaction.
4. Continue updating backlog and reflecting in process.md.

---

**Summary:**  
The Sprint 0 process focused on establishing structure, documentation, and clarity before coding began. This foundation ensures that the next sprints can proceed efficiently, with well-defined stories and measurable goals.
