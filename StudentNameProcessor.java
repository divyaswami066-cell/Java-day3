public class StudentNameProcessor {

    String fullName = " rahul kumar ";

    public static void main(String[] args) {

        StudentNameProcessor obj = new StudentNameProcessor();

        String cleanedName = obj.fullName.trim();
        String upperName = cleanedName.toUpperCase();
        int count = cleanedName.length();

        int spaceIndex = cleanedName.indexOf(" ");

        String firstName = cleanedName.substring(0, spaceIndex);
        String lastName = cleanedName.substring(spaceIndex + 1);

        boolean validation = upperName.startsWith("RAHUL");

        System.out.println("Original Name: " + obj.fullName);
        System.out.println("Cleaned Name: " + cleanedName);
        System.out.println("Uppercase Name: " + upperName);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Character Count: " + count);
        System.out.println("Validation: " + validation);
    }
}