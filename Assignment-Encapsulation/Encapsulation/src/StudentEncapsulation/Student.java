package StudentEncapsulation;

class Student {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("Arun");
        s.display();
    }
}
