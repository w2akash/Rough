package if_else;

public class large {
	public static void main(String[] args) {
		int a = 90000;
		int b = 6400000;
		int c = 12000;
		int d = 500000;
		int e = 100000;
		if (a > b) {
			if (a > c) {
				if (a > d) {
					if (a > e) {
						System.out.println("a is large=" + (a));
					} else {
						System.out.println("e is large=" + (e));
					}
				} else {
					if (d > e) {
						System.out.println("d is large=" + (d));
					} else {
						System.out.println("e is larger=" + (e));
					}
				}
			} else {
				if (d > e) {
					System.out.println("d is large=" + (d));
				} else {
					System.out.println("e is larger=" + (e));
				}
			}
		} else {
			if (d > e) {
				System.out.println("d is large=" + (d));
			} else {
				System.out.println("e is larger=" + (e));
			}

			if (b > c) {
				if (b > d) {
					if (b > e) {
						System.out.println("b is large=" + (b));
					} else {
						System.out.println("e is large=" + (e));
					}
				} else {
					if (d > e) {
						System.out.println("d is large=" + (d));
					} else {
						System.out.println("e is large=" + (e));
					}
				}
			}

			if (c > d) {
				if (c > e) {
					System.out.println("c is large=" + (c));
				} else {
					System.out.println("e is large=" + (e));
				}
			}
			if (d > e) {
				System.out.println("d is large=" + (d));
			} else {
				System.out.println("e is large=" + (e));
			}
		}
	}
}
