import java.util.Scanner;

public class CalculatorDemo {
	public static void main(String[] arr) {
		int num1, num2, sum, diff, pro, quo, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		num2 = sc.nextInt();

		sum = num1 + num2;
		diff = num1 - num2;
		pro = num1 * num2;
		quo = num1 / num2;
		rem = num1 % num2;
		System.out.println("\n\nResult of computation: \n====================");
		System.out.println("First number: " + num1 + "\tSecond number: " + num2);
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);
		System.out.println("Product: " + pro);
		System.out.println("Quotient division: " + quo);
		System.out.println("Remainder division: " + rem);
		sc.close();

	}

}
