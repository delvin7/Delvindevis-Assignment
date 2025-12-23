package VehicleCar;

class Car extends Vehicle {
    String brand = "Honda";

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("Brand: " + c.brand);
        System.out.println("Speed: " + c.speed);
    }
}
