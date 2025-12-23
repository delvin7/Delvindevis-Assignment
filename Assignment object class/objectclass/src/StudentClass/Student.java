package StudentClass;

class Student {
    int id;
    String name;

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Arun";
        s.displayDetails();
    }
}
