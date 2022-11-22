package for_loop;

public class Trianle_Right_Arrow {
	public static void main(String[] args) {
		for (int a = 1; a <= 6; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a = 5; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
