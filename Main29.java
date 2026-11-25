import java.util.HashSet;
class Main29{
    public static void main(String[] args) {
        HashSet<String> courses = new HashSet<>();//HashSet
        courses.add("learn java");
        courses.add("learn SQL");
        courses.add("learn HTML");
        courses.add("learn java");
        System.out.println(courses);
        System.out.println("Contains Java: " + courses.contains("learn java"));
        courses.remove("learn SQL");
        System.out.println("After removal: " + courses);
    }
}
