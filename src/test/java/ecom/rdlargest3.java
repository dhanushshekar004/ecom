package ecom;

public class rdlargest3 {

	public static void main(String[] args) {

		int a[] = { 9, 13, 5, 7, 3 };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (a[i] < a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}

		System.out.println(a[a.length - 1]);

	}

}
