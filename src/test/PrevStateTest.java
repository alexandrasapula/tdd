package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrevStateTest {
    @Test
    void testPrevStateFromShipped() {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
        orderFacade.payOrder();
        orderFacade.processOrder();
        orderFacade.shipOrder();

        Order order = orderFacade.getOrder();

        order.prevState();

        assertEquals("Processing", order.getStatus());
    }
}
