
class EmployeeSalary {

    void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero");
        } else {
            System.out.println("Employee Salary: ₹" + salary);
        }
    }

    public static void main(String[] args) {
        EmployeeSalary emp = new EmployeeSalary();

        double[] salaries = {25000, 50000, 0, -1000};

        for (double salary : salaries) {
            try {
                emp.setSalary(salary);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
