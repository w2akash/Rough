package oops;

public class I_Engineering 			// Using Object creation we assign the value to the variables
{
	String dapartname;
	int fees;
	int studentid;
	String studentname;
	char batch;
	
	void display()		// i used display as a method name.  We can use anything 
	{
		System.out.println(dapartname);
		System.out.println(fees);
		System.out.println(studentid);
		System.out.println(studentname);
		System.out.println(batch);
		System.out.println();						// this is used to create space
	}
	public static void main(String[] args) 
	{
		I_Engineering student = new I_Engineering(); 	// object created for first student. i taken student as a ref.name. we can use anything 
		student.dapartname= "Electrical";			// from here
		student.fees= 55000;								
		student.studentid= 88;					    //  to
		student.studentname="Akash Sutar";
		student.batch='C';							//  here. I assigned the value for the variables.
		student.display();							// here i called UDM(user defined method which was "display".
		
		I_Engineering student2 = new I_Engineering(); 	// object created for second student. i taken student2 as a ref.name. we can use anything 
		student2.dapartname= "Mechanical";
		student2.fees= 55000;
		student2.studentid= 104;
		student2.studentname="Ajay Sutar";
		student2.batch='A';
		student2.display();
	}
}
