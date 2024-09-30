package ecom;

public class palandrome {

	public static void main(String[] args) {
		String Str = "dhanush";
		if (palandromeOrNot(Str)) {

			System.out.println("is palandrome");
		} else {
			System.out.println("is not palandrome");
		}

	}

	public static Boolean palandromeOrNot(String Str) {

		int first = 0;
		int last = Str.length() - 1;

		while (first < last) {
			if (Str.charAt(last) == Str.charAt(first)) {

				return true;
			}

			first++;
			last--;
		}

		return false;

	}
}
