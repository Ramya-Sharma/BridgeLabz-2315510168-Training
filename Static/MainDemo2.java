public class MainDemo2 {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice");
        alice.addProduct(new Product("Apples", 2, 3.0));  // 2kg * $3
        alice.addProduct(new Product("Milk", 1, 2.0));    // 1 * $2

        BillGenerator bg = new BillGenerator();
        double totalBill = bg.generateBill(alice);

        System.out.println("Customer: " + alice.getName());
        for (Product p : alice.getProducts()) {
            System.out.println(p.getName() + " (" + p.getQuantity() +
                               " units @ $" + p.getPricePerUnit() +
                               ") = $" + p.getTotalPrice());
        }
        System.out.println("Total Bill: $" + totalBill);
    }
}
