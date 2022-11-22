package for_loop;

public class Triangle_J {
	public static void main(String[] args) {
		int sky = 4;

		for (int b = 1; b <= sky; b++)
		// for (int b = sky; b >= 1; b--)

		{

			for (int a = (sky - 1); a >= b; a--)

			{
				System.out.print(" ");
			}
			
			for (int a = 1; a <= b; a++) {
				System.out.print("*");
			}
			{
				System.out.println();
			}
		}
	}

}