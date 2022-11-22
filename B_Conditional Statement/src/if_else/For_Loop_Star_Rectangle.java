package if_else;

public class For_Loop_Star_Rectangle {
	public static void main(String[] args) {
		for (int a = 1; a <= 8; a++) // Shows how many line will create line-start with 1 & end up to 4=4
		{
			for (int b = 1; b <= 5; b++) // Show how column will b create. start with 1 & end with 4= 4
			{
				System.out.print("*"); // Shows Star Rectangle
			}
			System.out.println(); // provide gaps or used to cut line
		}
	}

}
