import java.util.Scanner;	//importing Scanner class

class Student{	//class to declare instance variables
	int id;
	String name;
	static String course;
}
//creating class for main method
class VariableDemo{		
	public static void main(String args[]) {	//main method
		
		//creating objects of student class and scanner class respectively.
		Student st=new Student();
		Scanner sc=new Scanner(System.in);
		
		//taking input
		System.out.println("Please enter student Id");
		st.id=sc.nextInt();
		System.out.println("Please enter Name");
		st.name=sc.next();
		Student.course="GNIIT";
		
		//output
		System.out.println("===Student Details===");
		System.out.println(st.id+" "+st.name+" "+Student.course);
		sc.close();
	}
}
