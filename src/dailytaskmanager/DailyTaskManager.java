package dailytaskmanager;

import java.util.Scanner;

public class DailyTaskManager {

   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        System.out.println("Welcome to the Daily Task Manager!");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task Status");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter task name:");
                    String taskName = scanner.nextLine();
                    taskManager.addTask(new Task(taskName));
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.println("\nYour Tasks:");
                    taskManager.viewTasks();
                    break;

                case 3:
                    System.out.println("Enter task number to update status:");
                    int taskNumber = scanner.nextInt();
                    taskManager.updateTaskStatus(taskNumber);
                    break;

                case 4:
                    System.out.println("Enter task number to delete:");
                    int deleteNumber = scanner.nextInt();
                    taskManager.deleteTask(deleteNumber);
                    break;

                case 5:
                    System.out.println("Exiting. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
}
