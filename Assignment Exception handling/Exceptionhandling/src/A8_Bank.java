class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String msg) {
        super(msg);
    }
}

public class A8_Bank {
    public static void main(String[] args) {
        int balance = 500;
        try {
            if (balance < 1000) {
                throw new InvalidBalanceException("Low Balance");
            }
        }
        catch (InvalidBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
