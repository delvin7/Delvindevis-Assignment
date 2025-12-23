package ECommerse;
class Order {
    int orderId;
    String customerName;
    double amount, tax;

    Order(int id, String name, double amt) {
        orderId = id;
        customerName = name;
        amount = amt;
        tax = amount * 0.18;
    }

    void display() {
        System.out.println(orderId + " " + customerName + " " + (amount + tax));
    }

    public static void main(String[] args) {
        Order o = new Order(1, "Rahul", 1000);
        o.display();
    }
}
