package bankInterest;

class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }

    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println("SBI Interest: " + b1.getInterestRate());
        System.out.println("HDFC Interest: " + b2.getInterestRate());
    }
}