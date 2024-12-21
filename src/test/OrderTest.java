package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testOrderFlow() {
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.createOrder();
        assertEquals("Created", orderFacade.getOrderStatus());

        orderFacade.payOrder();
        assertEquals("Paid", orderFacade.getOrderStatus());

        orderFacade.processOrder();
        assertEquals("Processing", orderFacade.getOrderStatus());

        orderFacade.shipOrder();
        assertEquals("Shipped", orderFacade.getOrderStatus());
    }
}
