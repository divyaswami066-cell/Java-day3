public class MessageBuilder {

    String firstName = "Java";
    String lastName = "Developer";

    public static void main(String[] args) {

        MessageBuilder obj = new MessageBuilder();

        String fullName = obj.firstName.concat(" ").concat(obj.lastName);

        System.out.println("Welcome, " + fullName);
    }
}