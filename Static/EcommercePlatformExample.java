import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

// Order class aggregates products
class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) { products.add(p); }

    public void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println("  Product: " + p.getName() + ", Price: " + p.getPrice());
        }
    }
}

// Customer places orders
class ECustomer {
    private String name;
    private List<Order> orders;

    public ECustomer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) { orders.add(o); }

    public void showOrders() {
        System.out.println("Customer: " + name + " has orders:");
        for (Order o : orders) {
            o.showOrder();
        }
    }
}

public class EcommercePlatformExample {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Phone", 30000);
        Product p3 = new Product("Headphones", 2000);

        Order o1 = new Order("ORD001");
        o1.addProduct(p1);
        o1.addProduct(p3);

        Order o2 = new Order("ORD002");
        o2.addProduct(p2);

        ECustomer c1 = new ECustomer("Anushka");
        c1.placeOrder(o1);
        c1.placeOrder(o2);

        c1.showOrders();
    }
}