class InvalidNameException extends Exception {
    public InvalidNameException(String msg) { super(msg); }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) { super(msg); }
}

public class A12_Validation {
    static void validate(String name, int age) throws InvalidNameException, InvalidAgeException {
        if (name.isEmpty())
            throw new InvalidNameException("Name invalid");
        if (age < 18)
            throw new InvalidAgeException("Age invalid");
    }

    public static void main(String[] args) {
        try {
            validate("", 15);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
