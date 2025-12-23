package Insurancepolicy;

class Policy {
    private int policyId;
    private double premium;

    public void calculatePremium(int age) {
        if (age < 30)
            premium = 5000;
        else
            premium = 8000;
    }

    public static void main(String[] args) {
        Policy p = new Policy();
        p.calculatePremium(28);
        System.out.println("Premium: " + p.premium);
    }
}

