package ecom;

import java.util.Scanner;

public class Ifconditions {
	static boolean s;

	public static void ageCalci(int a, boolean b) {
		if (a < 20 && a > 5) {
			if (b == true) {
				System.out.println("Fair is 250");
			} else {
				System.out.println("Fair is 200");
			}

		} else if (a < 5) {

			if (b == true) {
				System.out.println("Fair is 150");
			} else {
				System.out.println("Fair is 100");
			}
		} else if (a > 25) {
			if (b == true) {
				System.out.println("Fair is 350");
			} else {
				System.out.println("Fair is 300");
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter age and 3rd glass is requried enter true or enter false");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();

		if (b.equalsIgnoreCase("yes") || b.equalsIgnoreCase("s") || b.equalsIgnoreCase("ys")) {
			s = true;

		}

		ageCalci(a, s);

	}

}
