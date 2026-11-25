
class Manager {
}

class Developer {
}

class EmployeeRoleManagement {
    public static void main(String[] args) {

        // Test 1: Developer object
        Object obj = new Developer();

        try {
            Manager m = (Manager) obj;
            System.out.println("Manager object created");
        } catch (ClassCastException e) {
            System.out.println("Invalid Employee Role Conversion");
        }

        // Test 2: Manager object
        obj = new Manager();

        try {
            Manager m = (Manager) obj;
            System.out.println("Valid Manager Conversion");
        } catch (ClassCastException e) {
            System.out.println("Invalid Employee Role Conversion");
        }
    }
}
