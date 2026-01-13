public class A6_NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int x = 10/0;
            }
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Division error");
            }
        }
        catch (Exception e) {
            System.out.println("Outer catch");
        }
    }
}
