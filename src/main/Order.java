package main;

public class Order {
    private OrderState state;

    public Order() {
        state = new CreatedState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void prevState() {
        state.prev(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}

