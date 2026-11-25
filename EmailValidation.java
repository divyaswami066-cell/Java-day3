public class EmailValidation {

    String email = "student123@gmail.com";

    public static void main(String[] args) {

        EmailValidation obj = new EmailValidation();

        if (!obj.email.isEmpty() &&
            obj.email.contains("@") &&
            obj.email.endsWith(".com") &&
            obj.email.startsWith("student")) {

            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}