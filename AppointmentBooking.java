
class AppointmentBooking {
    public static void main(String[] args) {
        String[] availableSlots = {
            "09:00 AM", "10:30 AM", "12:00 PM"
        };

        // Test 1: Valid details
        book("Rahul", 25, "10:30 AM", 1, availableSlots);

        // Test 2: Null patient name
        book(null, 25, "10:30 AM", 1, availableSlots);

        // Test 3: Invalid age
        book("Rahul", -5, "10:30 AM", 1, availableSlots);

        // Test 4: Invalid slot
        book("Rahul", 25, "10:30 AM", 5, availableSlots);
    }

    static void book(String patientName, int age,
                     String appointmentTime, int position,
                     String[] availableSlots) {
        try {
            if (patientName == null) {
                throw new NullPointerException();
            }

            System.out.println("Patient Name: " + patientName);
            System.out.println("Name Length: " + patientName.length());

            if (age <= 0) {
                throw new IllegalArgumentException();
            }

            System.out.println("Age: " + age);

            System.out.println("Selected Slot: " + availableSlots[position]);

            System.out.println("Appointment Booked Successfully");

        } catch (NullPointerException e) {
            System.out.println("Patient information is missing");

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid age");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid appointment slot");

        } finally {
            System.out.println("Appointment Booking Process Completed");
            System.out.println();
        }
    }
}
