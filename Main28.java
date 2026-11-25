import java.util.LinkedList;
class Main28{
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();//LinkedList
        tasks.add("learn java");
        tasks.add("learn SQL");
        tasks.add("learn HTML");
        tasks.addFirst("learn CSS");
        tasks.addLast("learn JavaScript");
        System.out.println(tasks);
        tasks.removeFirst();
        tasks.removeLast();
        System.out.println("After removal: " + tasks);
    }

}