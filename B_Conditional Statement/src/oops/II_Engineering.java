package oops;

public class II_Engineering {		// By using Constructor we assign the value to the variables
	String dapartname;
	int fees;
	int studentid;
	String studentname;
	char batch;
	II_Engineering(String dapart,int fee,int studid,String studname,char bat)		// i used display as a method name.  We can use anything 
	{
		dapartname=dapart;
		fees=fee;
		studentid=studid;
		studentname=studname;
		batch=bat;
		
	}
	void display()		// i used display as a method name.  We can use anything 
	{
		System.out.println(dapartname);
		System.out.println();
		System.out.println(fees);
		System.out.println();
		System.out.println(studentid);
		System.out.println();
		System.out.println(studentname);
		System.out.println();
		System.out.println(batch);
	
	}
	public static void main(String[] args) 
	{
		II_Engineering student = new II_Engineering("Electrical",50000,88,"Akash Sutar",'C'); 	// object created for first student. i taken student as a ref.name. we can use anything 
		
		student.display();							// here i called UDM(user defined method which was "display".
		
	}
}
