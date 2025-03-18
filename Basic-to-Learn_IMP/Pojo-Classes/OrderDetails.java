// Pojo Class:

public class OrderDetails {
    // Private fields
    private int id;
    private double price;
    private String customerName;
    private int noOfItem;

    // Default constructor
    public OrderDetails() {
    }

    // Parameterized constructor
    public OrderDetails(int id, double price, String customerName, int noOfItem) {
        this.id = id;
        this.price = price;
        this.customerName = customerName;
        this.noOfItem = noOfItem;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getNoOfItem() {
        return noOfItem;
    }

    public void setNoOfItem(int noOfItem) {
        this.noOfItem = noOfItem;
    }
}
