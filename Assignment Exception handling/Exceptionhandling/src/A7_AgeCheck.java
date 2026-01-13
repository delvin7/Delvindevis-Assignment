public class A7_AgeCheck {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new Exception("Age not eligible");
            }
            System.out.println("Eligible");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
