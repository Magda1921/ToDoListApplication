package ToDoList;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name of your task");
        String name = scanner.nextLine();
        System.out.println("Enter a description of your task");
        String description = scanner.nextLine();


//        System.out.println("Enter a date of your task");
//        Date date = scanner.

        System.out.println("Enter a priority of your task");
        int priority = scanner.nextInt();

       while(true) {
           //change - all the time the question "Do you want to add a new task or exit? /a /x" displays
           System.out.println("Do you want to add a new task or exit? /a /x");
          name = scanner.nextLine();

           if (name.equals("/x")) {
               new ToDoList();
               new ArrayList();
               Task task = new Task();
               task.setName(name);
               task.setDescription(description);
               task.setPriority(priority);
               System.out.println(task);
               return;
           }
       }

    }
}