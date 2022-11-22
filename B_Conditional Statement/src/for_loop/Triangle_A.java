package for_loop;

public class Triangle_A {
	public static void main(String[] args) {
		int feel_The_Sky = 7;

		for (int a = 1; a <= feel_The_Sky; a++) {
			for (int b = (feel_The_Sky - 1); b >= a; b--) {
				System.out.print(" ");
			}
			for (int b = 1; b <= a; b++) {
				System.out.print("* ");
			}
			{
				System.out.println();
			}
		}

	}
}
