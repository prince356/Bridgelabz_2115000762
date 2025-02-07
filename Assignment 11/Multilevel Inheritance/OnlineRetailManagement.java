//super class
class Order{
    protected int orderId;
    protected String orderDate;

    public Order(int orderId , String orderDate){
        this.orderDate = orderDate;
        this.orderId = orderId;
    }

    public String getOrderStatus(){
        return "Order Placed";
    }
}


class ShippedOrder extends Order{
    protected int TrackingNumber;

    public ShippedOrder(int orderId , String orderDate , int TrackingNumber){
        super(orderId, orderDate);
        this.TrackingNumber = TrackingNumber;
    }

    @Override
    public String getOrderStatus(){
        return "Order Placed with Tracking Number:- " + TrackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(int orderId , String orderDate , int TrackingNumber , String deliveryDate){
        super(orderId, orderDate, TrackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus(){
        return "Order delivered on " + deliveryDate + " Tracking Number:- " + super.TrackingNumber;
    }
}


public class OnlineRetailManagement {
    public static void main(String[] args) {
        Order order = new Order(1, "01-02-2025");
        ShippedOrder shippedorder = new ShippedOrder(2, "02-02-2025", 1234);
        DeliveredOrder deliveredOrder = new DeliveredOrder(3, "02-01-2025", 1255, "07-01-2025");

        System.out.println(order.getOrderStatus());
        System.out.println(shippedorder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
