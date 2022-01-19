package UI;

import model.TaskStatus;

import java.util.Scanner;

public class CreateTask {
    Scanner scanner = new Scanner(System.in);

    String createName() {
        System.out.println("Введите название задачи:");
        return scanner.next();
    }

    String createDescription() {
        System.out.println("Кратко опишите задачу");
        return scanner.next();
    }

    String installStatus() {
        System.out.println("Введите статус задачи: ");
        System.out.println("1 - Новая, 2 - В работе, 3 - Выполненная.");
        String status = "";
        Scanner scanner = new Scanner(System.in);
        String commandValue = scanner.nextLine();
        switch (TaskStatus.valueOf(commandValue)) {
            case NEW:
                status = "Новая";
                break;
            case IN_PROGRESS:
                status = "В процессе";
                break;
            case DONE:
                status = "Завершенная";
                break;
            default:
                System.out.println("Неверная команда");
        }
        return status;
    }

    private static long id = 0;

    long generateID() {
        id++;
        return id;
    }
}
