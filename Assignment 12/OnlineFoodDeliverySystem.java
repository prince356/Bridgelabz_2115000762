abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    private double additionalCharge;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharge;
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class DiscountedVegItem extends VegItem implements Discountable {
    private double discountPercentage;

    public DiscountedVegItem(String itemName, double price, int quantity, double discountPercentage) {
        super(itemName, price, quantity);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * (discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercentage + "% off";
    }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem[] foodItems) {
        for (FoodItem foodItem : foodItems) {
            foodItem.getItemDetails();
            double totalPrice = foodItem.calculateTotalPrice();
            System.out.println("Total Price: $" + totalPrice);

            if (foodItem instanceof Discountable) {
                Discountable discountableItem = (Discountable) foodItem;
                double discount = discountableItem.applyDiscount();
                System.out.println(discountableItem.getDiscountDetails());
                System.out.println("Discounted Price: $" + (totalPrice - discount));
            }
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        VegItem vegItem = new VegItem("Veg Burger", 5.99, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Burger", 7.99, 1, 1.50);
        DiscountedVegItem discountedVegItem = new DiscountedVegItem("Veg Pizza", 9.99, 3, 10);

        FoodItem[] foodItems = {vegItem, nonVegItem, discountedVegItem};
        processOrder(foodItems);
    }
}