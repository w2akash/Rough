package if_else;

public class Find_Largest_Number_4_Char {
	public static void main(String[] args) 
	{	
		int a=9;
		int s=64;
		int t=11;
		int p=50;
		
		if(a>s)
		{
			if(a>t)
			{
				if (a>p)
				{
					System.out.println("a is largest");
					System.out.println(a);
				}
				else
				{
					System.out.println("p is largest");
					System.out.println(p);
				}
			}
			else
			{
				if(t>p)
				{
					System.out.println("t is largest");
					System.out.println(t);
				}
				else
				{
					System.out.println("p is largest");
					System.out.println(p);
					
				}
			}
		}
		else
		{
			if (s>t)
			{
				if (s>p)
				{
					System.out.println("s is largest");
					System.out.println(s);
				}
				else
				{
					System.out.println("p is largest");
					System.out.println(p);
				}
			}
			else
			{ 
				if(t>p)
				{
					System.out.println("t is largest");
					System.out.println(t);
				}
				else
				{
					System.out.println("p is largest");
					System.out.println(p);
				}
			}
		}
	}
}