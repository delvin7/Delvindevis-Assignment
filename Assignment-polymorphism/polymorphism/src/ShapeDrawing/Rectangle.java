package ShapeDrawing;

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle");
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}