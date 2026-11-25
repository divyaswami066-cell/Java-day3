
class StudentRegistration {
    public static void main(String[] args) {
        String[] subjects = {"Java", "Python", "DBMS"};

        // Test 1: Valid details
        register("Divya", 20, "90", 0, subjects);

        // Test 2: Null student name
        register(null, 20, "90", 0, subjects);

        // Test 3: Invalid marks
        register("Divya", 20, "abc", 0, subjects);

        // Test 4: Invalid subject position
        register("Divya", 20, "90", 5, subjects);

        // Test 5: Invalid age
        register("Divya", 0, "90", 0, subjects);
    }

    static void register(String studentName, int age,
                         String marks, int position, String[] subjects) {
        try {
            System.out.println("\nTesting: " + studentName);

            System.out.println("Name length: " + studentName.length());

            int m = Integer.parseInt(marks);
            System.out.println("Marks: " + m);

            System.out.println("Subject: " + subjects[position]);

            if (age <= 0) {
                throw new IllegalArgumentException();
            }

            System.out.println("Student Registration Completed");

        } catch (NullPointerException e) {
            System.out.println("Student name cannot be null");
        } catch (NumberFormatException e) {
            System.out.println("Please enter numeric marks");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid subject position");
        } catch (IllegalArgumentException e) {
            System.out.println("Age must be greater than zero");
        }
    }
}
