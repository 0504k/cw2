package service;

import model.Task;
import model.ImportantTask;
import util.FileManager;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private List<Task> tasks;
    private int idCounter = 1;

    public TaskService() {
        tasks = FileManager.load();

        for (Task t : tasks) {
            if (t.getId() >= idCounter) {
                idCounter = t.getId() + 1;
            }
        }
    }

    public void addTask(String title, String desc, boolean important, int priority) {

        if (important) {
            tasks.add(new ImportantTask(idCounter, title, desc, priority));
        } else {
            tasks.add(new Task(idCounter, title, desc));
        }

        idCounter++;
        FileManager.save(tasks);
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks.");
            return;
        }

        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void updateTask(int id, String title, String desc) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.setTitle(title);
                t.setDescription(desc);
                FileManager.save(tasks);
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(int id) {
        tasks.removeIf(t -> t.getId() == id);
        FileManager.save(tasks);
    }
}