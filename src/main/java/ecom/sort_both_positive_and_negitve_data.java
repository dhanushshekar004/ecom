package ecom;

import java.util.Arrays;

public class sort_both_positive_and_negitve_data {
	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * int a[]= {-1,-4,-3,0,-2,-9,2,5,7,9};
	 * 
	 * 
	 * 
	 * Arrays.sort(a);
	 * 
	 * 
	 * for(int i=0;i<a.length;i++) {
	 * 
	 * System.out.print(a[i]+" ");
	 * 
	 * 
	 * }
	 * 
	 * }
	 */
	// "=============================using Inbuild Function"======================

	public static void main(String[] args) {

		int a[] = { -1, -4, -3, 0, -2, -9, 2, 5, 7, 9 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] < a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
//"==========================without using inbuild function"========================================