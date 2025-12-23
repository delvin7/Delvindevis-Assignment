package BankAccount;

class BankAccount {
    String accountNumber, holderName;
    double balance;

    BankAccount(String acc, String name, double bal) {
        accountNumber = acc;
        holderName = name;
        balance = bal;
    }

    void showAccount() {
        System.out.println(accountNumber + " " + holderName + " " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("12345", "Suresh", 50000);
        b.showAccount();
    }
}
