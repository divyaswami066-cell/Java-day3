public class FormValidator {
    public static void main(String[] args) {

        String name = "";

        if (name.isEmpty()) {
            System.out.println("Name is required");
        } else {
            System.out.println("Name submitted successfully");
        }
    }
}