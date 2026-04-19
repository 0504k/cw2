package util;

import model.Task;
import model.ImportantTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private static final String FILE_NAME = "tasks.txt";

    public static void save(List<Task> tasks) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Task t : tasks) {

                if (t instanceof ImportantTask it) {
                    bw.write("I," + it.getId() + "," + it.getTitle() + "," + it.getDescription() + "," + it.getPriority());
                } else {
                    bw.write("N," + t.getId() + "," + t.getTitle() + "," + t.getDescription());
                }

                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println("Save error");
        }
    }

    public static List<Task> load() {

        List<Task> tasks = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) return tasks;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] p = line.split(",");

                if (p[0].equals("I")) {
                    tasks.add(new ImportantTask(
                            Integer.parseInt(p[1]),
                            p[2],
                            p[3],
                            Integer.parseInt(p[4])
                    ));
                } else {
                    tasks.add(new Task(
                            Integer.parseInt(p[1]),
                            p[2],
                            p[3]
                    ));
                }
            }

        } catch (Exception e) {
            System.out.println("Load error");
        }

        return tasks;
    }
}