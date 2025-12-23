package BankSavings;


	class SavingAccount extends Bank {

	    void calculateInterest(double amount) {
	        double interest = (amount * interestRate) / 100;
	        System.out.println("Interest: " + interest);
	    }

	    public static void main(String[] args) {
	        SavingAccount sa = new SavingAccount();
	        sa.calculateInterest(10000);
	    }
	}

