import java.util.Scanner; 	//importing scanner class

public class CalculatorDemo {		//creating a class
	
	public static void main(String[] arr) {	//starting main method
		int num1, num2, sum, diff, pro, quo, rem;		//initialization of variables
		Scanner sc = new Scanner(System.in);	//creating the object of scanner class
		
		//Input
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		num2 = sc.nextInt();

		//computation logic
		sum = num1 + num2;
		diff = num1 - num2;
		pro = num1 * num2;
		quo = num1 / num2;
		rem = num1 % num2;
		
		
		//Output
		System.out.println("\n\nResult of computation: \n====================");
		System.out.println("First number: " + num1 + "\tSecond number: " + num2);
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);
		System.out.println("Product: " + pro);
		System.out.println("Quotient division: " + quo);
		System.out.println("Remainder division: " + rem);
		sc.close(); 	//closing scanner

	}

}
