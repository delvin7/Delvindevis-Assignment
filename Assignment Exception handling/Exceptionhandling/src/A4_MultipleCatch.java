public class A4_MultipleCatch {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            int arr[] = new int[5];
            arr[10] = 5;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        }
    }
}
