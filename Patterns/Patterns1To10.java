package Patterns;

public class Patterns1To10 {

	public static void main(String[] args) {

		int n = 5;

		// Pattern 1 - Square Star
		System.out.println("Pattern 1");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Pattern 2 - Right Triangle
		System.out.println("\nPattern 2");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Pattern 3 - Reverse Triangle
		System.out.println("\nPattern 3");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Pattern 4 - Number Triangle
		System.out.println("\nPattern 4");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Pattern 5 - Same Number Pattern
		System.out.println("\nPattern 5");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// Pattern 6 - Continuous Numbers
		System.out.println("\nPattern 6");
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}

		// Pattern 7 - Alphabet Pattern
		System.out.println("\nPattern 7");
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Pattern 8 - Pyramid
		System.out.println("\nPattern 8");
		for (int i = 1; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		// Pattern 9 - Inverted Pyramid
		System.out.println("\nPattern 9");
		for (int i = n; i >= 1; i--) {

			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		// Pattern 10 - Number Square
		System.out.println("\nPattern 10");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
