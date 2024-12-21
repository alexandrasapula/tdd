package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultipleOrdersTest {
    @Test
    void testMultipleOrders() {
        OrderFacade orderFacade1 = new OrderFacade();
        OrderFacade orderFacade2 = new OrderFacade();

        orderFacade1.createOrder();
        orderFacade2.createOrder();

        assertEquals("Created", orderFacade1.getOrderStatus());
        assertEquals("Created", orderFacade2.getOrderStatus());

        orderFacade1.payOrder();

        assertEquals("Paid", orderFacade1.getOrderStatus());
        assertEquals("Created", orderFacade2.getOrderStatus());
    }
}
