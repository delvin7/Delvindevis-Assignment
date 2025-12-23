package BankSavingsConstructorinheritance;

class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name); // calling parent constructor
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        Student s = new Student("Ravi", 102);
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.rollNo);
    }
}