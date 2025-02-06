import java.util.*;

//Product class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

//customer class
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order with ID: " + order.getOrderId());
    }

    public void showOrders() {
        System.out.println(name + "'s Orders:");
        for (Order order : orders) {
            System.out.println(order);
            for (Product product : order.getProducts()) {
                System.out.println("  " + product);
            }
        }
    }
}

//order class
class Order {
    private List<Product> products;
    private int orderId;
    private static int idCounter = 1;

    public Order() {
        this.products = new ArrayList<>();
        this.orderId = idCounter++;
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Total Amount: $" + getTotalAmount();
    }
}



public class ECommerce_Management {
    public static void main(String[] args) {
        
        Product product1 = new Product("Laptop", 1000.00);
        Product product2 = new Product("Smartphone", 500.00);
        Product product3 = new Product("Headphones", 150.00);

        
        Customer customer1 = new Customer("Mike Tyson");

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order();
        order2.addProduct(product3);

        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        customer1.showOrders();
    }
}