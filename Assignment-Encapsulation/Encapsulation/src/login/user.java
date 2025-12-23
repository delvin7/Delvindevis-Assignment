package login;

class User {
    private String email;
    private String password;

    public void setPassword(String password) {
    	this.email="ade@123";
        if (password.length() >= 8)
            this.password = password;
    }

    public static void main(String[] args) {
        User u = new User();
        u.setPassword("password123");
        System.out.println("Password set successfully");
    }
}
