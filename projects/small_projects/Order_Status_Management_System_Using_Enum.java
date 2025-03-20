enum OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED
}

class Order {
    private OrderStatus status;

    Order (){
        this.status = OrderStatus.PENDING;
    }

    public void ChangeOrderStatus (OrderStatus newStatus) {
        this.status = newStatus;
        System.out.println("OrderStatus changed to " + status);
    }

    public void showStatus () {
        System.out.println("OrderStatus now " + status);
    }
}

public class Order_Status_Management_System_Using_Enum {
    public static void main(String[] args) {
        Order order = new Order();

        order.showStatus();

        System.out.println("-------------------");

        order.ChangeOrderStatus(OrderStatus.PROCESSING);
        order.showStatus();

        System.out.println("-------------------");
        
        order.ChangeOrderStatus(OrderStatus.SHIPPED);
        order.showStatus();
        
        System.out.println("-------------------");

        order.ChangeOrderStatus(OrderStatus.DELIVERED);
        order.showStatus();

    }
}