public class StudentProfile {
    public static void main(String[] args) {

        String studentName = null;

        try {
            System.out.println("Name length: " + studentName.length());
        }
        catch (NullPointerException e) {
            System.out.println("Student name is not available");
        }

        studentName = "Divya";

        try {
            System.out.println("Name length: " + studentName.length());
        }
        catch (NullPointerException e) {
            System.out.println("Student name is not available");
        }
    }
}