public class A5_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("File opened");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("File closed");
        }
    }
}
