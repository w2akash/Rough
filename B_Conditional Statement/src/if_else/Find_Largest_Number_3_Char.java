package if_else;

public class Find_Largest_Number_3_Char {
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is largest");
				System.out.println(a);
			}
			else
			{
				System.out.println("c is largest");
				System.out.println();
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is largest");
				System.out.println(b);
			}
			else
			{
				System.out.println("c is largest");
				System.out.println(c);
			}
		}
	}
}
