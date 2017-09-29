import java.util.Scanner; //importing scanner class

public class StringFunctionsDemo { // creating class

	public static void main(String[] b) { // starting main method

		// initializing variable
		String str;
		Scanner sc = new Scanner(System.in); // creating scanner object
		// Input
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		// Processing and output
		System.out.println("The length of the string is: " + str.length());
		System.out.println("This string in uppercase is: " + str.toUpperCase());
		System.out.println("This string in lowercase is: " + str.toLowerCase());
		System.out.println("The substring of string is: " + str.substring(1, 4));

		sc.close();
	}

}
