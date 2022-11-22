package for_loop;

public class Odd_Triangle
{
	public static void main(String[] args)
	{
		int sky= 10;
		//for (int b=1; b<=sky; b++)		// For odd triangle
		for (int  b=sky; b>=1; b--)			// For mirror odd triangle
		{
			for (int a=(sky-1); a>=b; a--)
			{
				System.out.print(" ");
			}
				for (int a=1; a<=(2*b)-1; a++) // To get odd star output math-Cal used
				{
					System.out.print("*");
				}	
				{
				System.out.println();
				}
		}
		
	}

}
