package MobileStore;

class Mobile {
    String brand;
    int ram, storage;
    double price;

    Mobile(String brand) {
        this.brand = brand;
    }

    Mobile(String brand, int ram, int storage, double price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + ram + "GB " + storage + "GB " + price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung");
        Mobile m2 = new Mobile("Apple", 8, 128, 80000);
        m1.display();
        m2.display();
    }
}

