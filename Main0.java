class Main0 {
    String password = "Java@123";
    String confirmPassword = "Java@123";

    void check() {
        if (password.equals(confirmPassword)) {
            System.out.println("Password Matched");
        } else {
            System.out.println("Password Mismatch");
        }
    }
}

public class Main8 {
    public static void main(String[] args) {
        Main0 p = new Main0();
        p.check();
    }
}