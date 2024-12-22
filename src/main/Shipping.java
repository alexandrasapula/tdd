package main;

import java.util.Scanner;
import java.util.logging.Logger;

class Shipping {
    private static final Logger logger = LoggerConfig.getLogger();
    public void ship() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажіть адрес доставки:");
        String name = scanner.nextLine();
        System.out.println("Відправлення замовлення по адресу " + name);
    }
}
