package ecom;

import java.util.Iterator;

public class largest_word_in_a_string {
	
	public static void main(String[] args) {
		
	
	String s="dhanush maaa jjh ggbvbvfdrth";
	

	String[] size = s.split(" ");
	
	int slength = size.length;
	String max=size[0];
	for (int i = 0; i < size.length; i++) {
		
		System.out.println(size[i].length());
	if (size[i].length()>=max.length()) {
		
		max=size[i];
		
	}
	}

	
	int lll = max.length();
	System.out.println(lll+"    "+max );
	
	
}
}