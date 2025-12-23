package UserLoginSystem;
class User {
    String email, password;

    User(String email) {
        this.email = email;
    }

    User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    void display() {
        System.out.println(email + " " + password);
    }

    public static void main(String[] args) {
        User u1 = new User("a@gmail.com");
        User u2 = new User("b@gmail.com", "pass123");
        u1.display();
        u2.display();
    }
}
