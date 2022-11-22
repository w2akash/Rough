package if_else;

public class For_Loop_Star_Decreasing {
	public static void main(String[] args) {
		for (int a = 1; a <= 8; a++) {
			for (int b = 8; b >= a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
