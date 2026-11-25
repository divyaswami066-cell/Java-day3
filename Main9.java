class FormValidator {
    String name = "";

    void checkName() {
        if (name.isEmpty()) {
            System.out.println("Name is required");
        } else {
            System.out.println("Name submitted successfully");
        }
    }

    public static void main(String[] args) {
        FormValidator f1 = new FormValidator();
        f1.name = "";
        f1.checkName();

        FormValidator f2 = new FormValidator();
        f2.name = "Divya";
        f2.checkName();
    }
}