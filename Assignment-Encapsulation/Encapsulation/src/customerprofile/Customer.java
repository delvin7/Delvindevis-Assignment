package customerprofile;

class Customer {
    private String name;
    private int age;

    public void setAge(int age) {
        if (age >= 18)
            this.age = age;
    }

    public String getDetails() {
        return "Age: " + age;
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        c.setAge(25);
        System.out.println(c.getDetails());
    }
}
