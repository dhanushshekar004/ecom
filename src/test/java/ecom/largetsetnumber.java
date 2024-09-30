package ecom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class largetsetnumber {

	public static void main(String[] args) {

		int a[] = { 1, 5, 3, 5, 8 };

		List aa = Arrays.asList(a);

		for (int i = 0; i < a.length; i++) {
			aa.add(a[i]);

		}

		System.out.println(aa);
aa.stream().distinct().sorted(Collections.reverseOrder()).tolist();

	
	
	
	}

}
