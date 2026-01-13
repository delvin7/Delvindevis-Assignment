class Parent {
    void show() throws Exception {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child");
    }
}

public class A11_Override {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
