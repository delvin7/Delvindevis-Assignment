package Constructorchaining;

class Person {
    String name;
    int age;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this(name);
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Person p = new Person("Kiran", 25);
        p.display();
    }
}
