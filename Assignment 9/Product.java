
public class Product {

    static double discount = 10.0;
    private String productName;
    private double price;
    private int quantity;

    final int productID;

    public Product(int productID , String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount percentage: " + discount);
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product Id: "+ productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount percentage: " + discount);
        }
    }

    public static void main(String[] args) {
        Product pr = new Product(101, "Bag", 5000, 2);
        Product pr1 = new Product(102, "Bat", 2000, 3);
        pr.displayDetails();
        pr1.displayDetails();
        Product.updateDiscount(15.0);
    }
}
