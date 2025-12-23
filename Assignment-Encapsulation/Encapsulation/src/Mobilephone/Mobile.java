package Mobilephone;

class Mobile {
    private String brand;
    private double price = 20000;

    public double getPriceWithGST() {
        return price + (price * 0.18);
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        System.out.println("Price with GST: " + m.getPriceWithGST());
    }
}

