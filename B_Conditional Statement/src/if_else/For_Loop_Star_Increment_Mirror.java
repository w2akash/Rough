package if_else;

public class For_Loop_Star_Increment_Mirror {
	public static void main(String[] args) {
		for (int a = 8; a >= 1; a--) // Shows how many line will create line-start with 1 & end up to 8=8
		{
			for (int b = 8; b >= a; b--) // Show how column will b create. start with 1 & end with 8= 8
			{
				System.out.print("*"); // Shows Star increment Triangle
			}
			System.out.println(); // provide gaps or used to cut line
		}
	}
}
