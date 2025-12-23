package polymorphism;
class Printer {

    void print(int a) {
        System.out.println(a);
    }

    void print(String s) {
        System.out.println(s);
    }

    void print(int a, String s) {
        System.out.println(a + " " + s);
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10);
        p.print("Hello");
        p.print(5, "Java");
    }
}
