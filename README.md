# 📋 Task List Organizer

👤 Student  
Fatima Melisova

---

## 📌 Project Description

Task List Organizer is a console-based Java application designed to manage daily tasks.  
The system allows users to add, view, update, and delete tasks easily.

This project demonstrates core Object-Oriented Programming (OOP) concepts and provides a simple task management system.

---

## 🎯 Objectives

- Apply Object-Oriented Programming principles
- Implement CRUD (Create, Read, Update, Delete) operations
- Build a Command Line Interface (CLI)
- Store and retrieve data using file handling
- Handle user input and errors

---

## ✅ Project Features

- Add new task
- View all tasks
- Update task
- Delete task
- Console menu (CLI)
- Data saved in file
- Input validation

---

## 🧠 OOP Concepts

### 🔒 Encapsulation
- Fields in Task class are private
- Access through getters and setters

### 🧬 Inheritance
- ImportantTask extends Task

### 🔄 Polymorphism
- Method toString() is overridden

---

## Project Structure

src/
├── model/
│   ├── Task.java
│   ├── ImportantTask.java
├── service/
│   ├── TaskService.java
├── util/
│   ├── FileManager.java
├── Main.java
---

## ⚙️ Technologies Used

- Java
- ArrayList
- File I/O (BufferedReader, BufferedWriter)

---

## 💾 Data Storage

- Data is stored in tasks.txt
- Each line represents one task

Example:I,1,Math homework,Do exercises,2
N,2,Clean room,Today
---

## 🧪 Example Usage

### ➤ Add Task

Input:1
Math homework
Do exercises
true
2
---

### ➤ Show Tasks

Output:1 | Math homework | Do exercises | Priority: 2
---

### ➤ Update Task

Input:
3
1
Math exam
Prepare for test
---

### ➤ Delete Task

Input:
4
1
---

## ⚠️ Error Handling

- Prevents empty input
- Handles invalid data
- Uses try-catch blocks

---

## 📊 Data Structure

- ArrayList<Task> is used to store tasks

---

## 🚀 Future Improvements

- Add search functionality
- Add sorting
- Create GUI (JavaFX)
- Use database instead of file

---

