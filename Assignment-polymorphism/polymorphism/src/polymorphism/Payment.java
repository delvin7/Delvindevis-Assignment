package polymorphism;
class Payment {

    void pay(int amount) {
        System.out.println("Paid amount: " + amount);
    }

    void pay(int amount, String mode) {
        System.out.println("Paid " + amount + " using " + mode);
    }

    public static void main(String[] args) {
        Payment p = new Payment();
        p.pay(500);
        p.pay(1000, "UPI");
    }
}
