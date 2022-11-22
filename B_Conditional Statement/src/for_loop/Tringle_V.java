package for_loop;

public class Tringle_V {
	public static void main(String[] args) {
		int sky = 7;

		// for (int b = 1; b <= sky; b++)
		for (int b = sky; b >= 1; b--)

		{

			for (int a = (sky - 1); a >= b; a--)

			{
				System.out.print(" ");
			}
			for (int a = 1; a <= b; a++) {
				System.out.print("* ");
			}
			{
				System.out.println();
			}
		}
	}
}
