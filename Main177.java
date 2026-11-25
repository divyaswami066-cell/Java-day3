class InputValidator {
    String userInput = " ";

    void check() {
        if (userInput.isBlank()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Valid Input");
        }
    }
}

public class Main177{
    public static void main(String[] args) {
        InputValidator i = new InputValidator();
        i.check();
    }
}