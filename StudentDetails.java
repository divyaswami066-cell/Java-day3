public class StudentDetails {

    String details = "Saran,22,Java,85";

    public static void main(String[] args) {

        StudentDetails obj = new StudentDetails();

        String[] data = obj.details.split(",");

        System.out.println("Name: " + data[0]);
        System.out.println("Age: " + data[1]);
        System.out.println("Course: " + data[2]);
        System.out.println("Marks: " + data[3]);
    }
}