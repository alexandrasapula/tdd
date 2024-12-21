package main;

public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
        orderFacade.payOrder();
        orderFacade.processOrder();
        orderFacade.shipOrder();
    }
}
