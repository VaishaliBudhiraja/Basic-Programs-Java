import java.util.Scanner;
public class PatternStar {
public static void main(String args[])
{
	int i, j, en;
	System.out.println("Please enter the number till which you want the count..");
	Scanner sc=new Scanner(System.in);
	en=sc.nextInt();
	for (i=1; i<=en; i++)
	{
		for(j=1; j<=i; j++)
		{
			System.out.print("*");
		}
System.out.println("");
	}
	sc.close();
}
}
