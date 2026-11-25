public class InputCleaner {
    public static void main(String[] args) {

        String username = " JavaDeveloper ";

        System.out.println("Original length: " + username.length());

        String cleaned = username.trim();

        System.out.println("Cleaned length: " + cleaned.length());

        System.out.println("Cleaned username: " + cleaned);
    }
}