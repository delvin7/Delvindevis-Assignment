package Atm;

class ATMAccount {
    private int pin;
    private double balance = 5000;

    public void setPin(int pin) {
        if (String.valueOf(pin).length() == 4)
            this.pin = pin;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful. Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        ATMAccount atm = new ATMAccount();
        atm.setPin(1234);
        atm.withdraw(1000);
    }
}

