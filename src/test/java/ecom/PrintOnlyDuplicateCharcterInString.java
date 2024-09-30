package ecom;

import java.util.HashSet;

public class PrintOnlyDuplicateCharcterInString {

	public static void main(String[] args) {
		String chr = "dhanush";
		int length = chr.length();

		HashSet<Character> hs = new HashSet();

		for (int i = 0; i < length; i++) {
			hs.add(chr.charAt(i));
		}
		System.out.println(hs);

		for (Character oo : hs) {
			int count = 0;
			for (int i = 0; i < length; i++) {
				
				if(oo==chr.charAt(i))
				{
					count++;
				}

			}
		if(count>=2)
		{
			System.out.println(count+" "+oo);
		}
		
		
		
		}

	}

}
