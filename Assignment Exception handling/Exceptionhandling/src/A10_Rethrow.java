public class A10_Rethrow {
    public static void main(String[] args) {
        try {
            try {
                int x = 10/0;
            }
            catch (ArithmeticException e) {
                System.out.println("Logging error");
                throw e;
            }
        }
        catch (Exception e) {
            System.out.println("Handled again");
        }
    }
}
