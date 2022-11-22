package for_loop;

public class Diamond {
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
				System.out.print("* ");
			}
			{
				System.out.println();
			}
		}
		int akki = (sky - 1); // int akki=(4-1)=3;
		for (int c = 1; c <= akki; c++) // for( int c=_; c<=3; c++)
		{
			for (int d = 1; d <= c; d++) {
				System.out.print(" ");
			}
			for (int d = akki; d >= c; d--) {
				System.out.print("* ");
			}
			{
				System.out.println();
			}
		}
	}
}
