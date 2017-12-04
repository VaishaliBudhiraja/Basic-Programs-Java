import java.util.Scanner;
public class ForDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int sum=0;
		for (int i=1; i<=num; i++)
		{
			sum+=i;
		}
		System.out.println("Triangular sum for "+num+" : "+sum);
		sc.close();
	}

}
