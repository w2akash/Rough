package rough;
public class Akki 
{
		static int a=10;
		int b;
		int c;
		int n=50;
		
	 Akki ()
	 {
		 c=2;
		 b=4;
	 }
	 Akki (int e)
	 {
		 a=e;
		 b=4;
	 }
		 public static void main(String[] args) 
		 {
			 System.out.println(a);
			 Akki V = new Akki (); // object Created
			 System.out.println(V.b);
			 System.out.println(V.n);
//			 Akki U = new Akki (99); // object Created
			 System.out.println(a);
		 }
}