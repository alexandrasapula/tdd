package main;

import java.util.Scanner;
import java.util.logging.Logger;

class Payment {
    private static final Logger logger = LoggerConfig.getLogger();

    public void processPayment() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть метод оплати:");
        System.out.println("1 - Оплата карткою");
        System.out.println("2 - Оплата готівкою при отриманні");
        System.out.println("3 - Оплата через електронний гаманець");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                logger.fine("Обраний метод оплати: картка");
                System.out.println("Оплата карткою.");
                break;
            case 2:
                logger.fine("Обраний метод оплати: готівка");
                System.out.println("Оплата готівкою.");
                break;
            case 3:
                logger.fine("Обраний метод оплати: електроний гаманець");
                System.out.println("Оплата через електронний гаманець.");
                break;
            default:
                logger.severe("Замовлення відхилено");
                System.out.println("Невірний вибір! Замовлення не прийнято");
                System.exit(0);
        }
        System.out.println("Обробка платежу.");
    }
}
