package BankAccount;

class BankAccount {
    private String accountNumber;
    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(5000);
        System.out.println("Balance: " + b.getBalance());
    }
}
