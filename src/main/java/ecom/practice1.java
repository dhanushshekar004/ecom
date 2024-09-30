package ecom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class practice1 {

	public static void main(String[] args) {

		StringInput("1 4 1");

	}

	public static void StringInput(String sentance) {

	//	String c = sentance;
		String[] aa = sentance.split(" ");

		LinkedHashSet<String> sc = new LinkedHashSet<String>();

		for (int i = 0; i < aa.length; i++) {
			sc.add(aa[i]);
		}

		for (String word : sc) {

			int count = 0;

			for (int i = 0; i < aa.length; i++) {
				if (word.equals(aa[i])) {
					count++;
				}

			}

			System.out.println(word + "  " + count);

		}

	}

}