package main;

import java.util.logging.Logger;

public class OrderFacade {
    private static final Logger logger = LoggerConfig.getLogger();
    private Order order;
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;

    public OrderFacade() {
        this.order = new Order();
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.shipping = new Shipping();
    }

    public void createOrder() {
        inventory.checkStock(); logger.info("Створено нове замовлення");
        System.out.println("Замовлення створено. Статус: " + order.getStatus());
    }

    public void payOrder() {
        payment.processPayment();
        order.nextState();
        logger.info("Покупець оплатив замовлення");
        System.out.println("Замовлення оплачено. Статус: " + order.getStatus());
    }

    public void processOrder() {
        System.out.println("Замовлення в обробці.");
        order.nextState();
        logger.info("Статус: " + order.getStatus());
        System.out.println("Статус: " + order.getStatus());
    }

    public void shipOrder() {
        shipping.ship();
        order.nextState();
        logger.info("Замовлення відправлено");
        System.out.println("Замовлення відправлено. Статус: " + order.getStatus());
    }

    public String getOrderStatus() {
        return order.getStatus();
    }

    public Order getOrder() {
        return order;
    }
}

