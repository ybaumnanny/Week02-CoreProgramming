abstract class Order {
    private String orderId;
    private String orderDate;
    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    // Getter methods
    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }
    // Abstract method to get order status
    public abstract String getOrderStatus();
}
// Subclass: ShippedOrder (extends Order)
class ShippedOrder extends Order {
    private String trackingNumber;
    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    // Getter method
    public String getTrackingNumber() {
        return trackingNumber;
    }
    // Overriding getOrderStatus to reflect shipment
    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}
// Subclass DeliveredOrder created 
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    // Constructor
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    // Getter method
    public String getDeliveryDate() {
        return deliveryDate;
    }
    // Overriding getOrderStatus to reflect delivery
    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}
public class OrderManagement {
    public static void main(String[] args) {
        // Creating objects of each class
        Order order = new ShippedOrder("O12345", "2025-01-10", "T987654321");
        ShippedOrder shippedOrder = new ShippedOrder("O12346", "2025-01-11", "T987654322");
        DeliveredOrder deliveredOrder = new DeliveredOrder("O12347", "2025-01-12", "T987654323", "2025-01-14");

        // Displaying order status for each type of order
        System.out.println("Order ID: " + order.getOrderId() + " - Status: " + order.getOrderStatus());
        System.out.println("Order ID: " + shippedOrder.getOrderId() + " - Status: " + shippedOrder.getOrderStatus());
        System.out.println("Order ID: " + deliveredOrder.getOrderId() + " - Status: " + deliveredOrder.getOrderStatus());
    }
}
