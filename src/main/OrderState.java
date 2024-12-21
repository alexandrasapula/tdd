package main;

interface OrderState {
    void next(Order order);
    void prev(Order order);
    String getStatus();
}

class CreatedState implements OrderState {
    public void next(Order order) {
        order.setState(new PaidState());
    }

    public void prev(Order order) {
        System.out.println("Замовлення вже в початковому стані.");
    }

    public String getStatus() {
        return "Created";
    }
}

class PaidState implements OrderState {
    public void next(Order order) {
        order.setState(new ProcessingState());
    }

    public void prev(Order order) {
        order.setState(new CreatedState());
    }

    public String getStatus() {
        return "Paid";
    }
}

class ProcessingState implements OrderState {
    public void next(Order order) {
        order.setState(new ShippedState());
    }

    public void prev(Order order) {
        order.setState(new PaidState());
    }

    public String getStatus() {
        return "Processing";
    }
}

class ShippedState implements OrderState {
    public void next(Order order) {
        System.out.println("Замовлення вже відправлено.");
    }

    public void prev(Order order) {
        order.setState(new ProcessingState());
    }

    public String getStatus() {
        return "Shipped";
    }
}

