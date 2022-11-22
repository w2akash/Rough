package if_else;

public class Ladder_Else_If {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = 8;

		if (a < b) {
			System.out.println("if condition is satisfied");
		}
		
		else {
			{
				System.out.println("else part start from here");
			}
			if (c > b) {
				System.out.println("ladder condition satisfied");
			}
		}
		//System.out.println("Congratulation this is also you have successfully done");

	}

}
