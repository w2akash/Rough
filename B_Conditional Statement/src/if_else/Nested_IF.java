package if_else;

public class Nested_IF {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = a + b;

		if (a > c) // first condition
		{
			System.out.println(c);
		}
		if (b > c) // 4<6 condition true
		{
			if (a < c) // first condition
			{
				System.out.println(b);
			}
		}
	}
}
