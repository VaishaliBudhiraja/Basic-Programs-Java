class Demo
{
	public void average(int ...numbers)
	{
		double sum=0, avg=0;
		for(int a:numbers)
		{
			sum+=a;
		}
		avg=sum/numbers.length;
		System.out.println("Count:"+numbers.length+"\nSum :"+sum+"\nAverage :"+avg);
	}
}
public class VarArgsDemo {
	public static void main(String args[])
	{
		Demo ob=new Demo();
		ob.average(10,20,30,40);
	}
}
