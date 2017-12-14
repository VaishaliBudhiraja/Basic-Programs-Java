class Employee {
	int employeeId;
	String employeeName;
	float salary;

	Employee(int id, String name, float sal) {
		employeeId = id;
		employeeName = name;
		salary = sal;
	}

	Employee() {

		System.out.println("I am a default constructor");
	}

	public void printEmployeeDetails() {
		System.out.println("\n===Employee Details===");
		System.out.println("ID : " + employeeId);
		System.out.println("Name : " + employeeName);
		System.out.println("Salary : " + salary);
	}

}

public class ConstructorDemo {
	public static void main(String args[]) {
		Employee emp1 = new Employee(101, "Herbert", 85000);
		Employee emp2 = new Employee(102, "Kathy", 85000);
		Employee emp3 = new Employee(103, "Vaishali", 90000);

		emp1.printEmployeeDetails();
		emp2.printEmployeeDetails();
		emp3.printEmployeeDetails();

	}

}
