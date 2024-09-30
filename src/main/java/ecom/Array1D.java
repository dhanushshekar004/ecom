package ecom;

public class Array1D {

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 7 };
		int sum = 0;
		int ff[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {

			ff[i] = sum + a[i];
			sum = ff[i];

		}

		for (int i = 0; i < ff.length; i++) {

			System.out.println(ff[i]);
		}

	}

}
