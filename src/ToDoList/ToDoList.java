package ToDoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
   public List<Task> tasks;

   public ToDoList() {
   }

   public ToDoList(List<Task> tasks) {
      this.tasks = tasks;
   }

   public List<Task> getTasks() {
      return tasks;
   }

   public void setTasks(List<Task> tasks) {
      this.tasks = tasks;
   }

   @Override
   public String toString() {
      return "ToDoList{" +
              "tasks=" + tasks +
              '}';
   }

   public void AddTask() {
      System.out.println("Add task");
      System.out.println("Enter the name of the task: ");
      Scanner scanner = new Scanner(System.in);
      String name = scanner.nextLine();
      System.out.println("Enter the description of the task: ");
      String description = scanner.nextLine();
      System.out.println("Enter the priority of the task: ");
      Integer priority = scanner.nextInt();
      Task task = new Task(name, description, priority);
      tasks.add(task);

   }

   public void RemoveTask() {
      System.out.println("Remove task");
      Scanner scanner = new Scanner(System.in);
      System.out.println("What task do you want to remove?");
      String task = scanner.nextLine();
      tasks.remove(task);
   }
}
