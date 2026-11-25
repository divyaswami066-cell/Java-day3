public class TicketBooking {
    public static void main(String[] args) {

        String passengerName = "Rahul";

        int[] positions = {0, 2, 4, 5, -1};

        for (int i = 0; i < positions.length; i++) {

            int position = positions[i];

            try {
                System.out.println("Position: " + position);
                System.out.println("Character: " + passengerName.charAt(position));
            }
            catch (StringIndexOutOfBoundsException e) {
                System.out.println("Invalid character position");
            }

            System.out.println();
        }
    }
}