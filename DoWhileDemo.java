package tasks2;
import java.util.Scanner;
public class DoWhileDemo {
	public static void main(String args[]) {
		int num, m;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		System.out.print("Enter the multiplier: ");
		m=sc.nextInt();
		int i=1;
		do {
			System.out.println(num+" * "+i+" = "+(num*i));
			i++;
		}while(i<=m);
		sc.close();
	}
	

}
