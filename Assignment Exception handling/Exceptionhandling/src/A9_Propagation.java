public class A9_Propagation {
    static void test() throws ArithmeticException {
        int a = 10/0;
    }

    public static void main(String[] args) {
        try {
            test();
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled in main");
        }
    }
}
