class StudentName {
	String name = "Saran Velmurugan";
}

class Main {
	public static void main(String[] args) {
		StudentName student = new StudentName();

		System.out.println("Total characters: " + student.name.length());
		System.out.println("First character: " + student.name.charAt(0));
		System.out.println("Last character: " + student.name.charAt(student.name.length() - 1));
		System.out.println("Fifth character: " + student.name.charAt(4));
	}
}