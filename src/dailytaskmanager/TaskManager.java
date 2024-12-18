
package dailytaskmanager;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
     private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void updateTaskStatus(int taskNumber) {
        if (taskNumber <= 0 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }
        Task task = tasks.get(taskNumber - 1);
        task.setCompleted(!task.isCompleted());
        System.out.println("Task status updated successfully!");
    }

    public void deleteTask(int taskNumber) {
        if (taskNumber <= 0 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }
        tasks.remove(taskNumber - 1);
        System.out.println("Task deleted successfully!");
    }
}
