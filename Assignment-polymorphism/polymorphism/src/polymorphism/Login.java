package polymorphism;
class Login {

    void login(String email) {
        System.out.println("Login with email: " + email);
    }

    void login(String email, String password) {
        System.out.println("Login with email and password");
    }

    public static void main(String[] args) {
        Login l = new Login();
        l.login("test@gmail.com");
        l.login("test@gmail.com", "pass123");
    }
}

