package productprice;

class Product {
    private double price;

    public void setPrice(double price) {
        if (price >= 100 && price <= 100000)
            this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(2000);
        System.out.println("Price: " + p.getPrice());
    }
}
