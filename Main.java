import service.TaskService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskService service = new TaskService();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== TASK MANAGER =====");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();

                System.out.print("Title: ");
                String title = sc.nextLine();

                System.out.print("Description: ");
                String desc = sc.nextLine();

                System.out.print("Important (true/false): ");
                boolean important = sc.nextBoolean();

                int priority = 0;
                if (important) {
                    System.out.print("Priority (1-3): ");
                    priority = sc.nextInt();
                }

                service.addTask(title, desc, important, priority);
            }

            else if (choice == 2) {
                service.showTasks();
            }

            else if (choice == 3) {
                System.out.print("Task ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("New title: ");
                String title = sc.nextLine();

                System.out.print("New description: ");
                String desc = sc.nextLine();

                service.updateTask(id, title, desc);
            }

            else if (choice == 4) {
                System.out.print("Task ID: ");
                int id = sc.nextInt();
                service.deleteTask(id);
            }

            else if (choice == 5) {
                System.out.println("Bye!");
                break;
            }
        }
    }
}