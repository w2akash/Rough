package if_else;

public class For_Loop_Star_Increasing {
	public static void main(String[] args) {
		for (int a = 1; a <= 8; a++) // Shows how many line will create line-start with 1 & end up to 8=8
		{
			for (int b = 1; b <= a; b++) // Show how column will b create. start with 1 & end with 8= 8
			{
				System.out.print("*"); // Shows Star increment Triangle
			}
			System.out.println(); // provide gaps or used to cut line
		}
	}
}
