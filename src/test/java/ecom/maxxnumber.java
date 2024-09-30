package ecom;

import java.util.LinkedHashSet;

public class maxxnumber {
	
	
	public static void main(String[] args) {
		maxLength("john dhanush ssssss joe hariharan");
		
	}
	
	public static void maxLength(String sentance) {
		
		
		String[] spliedSentance = sentance.split(" ");
		
		
		String maxlength = spliedSentance[0];
		
		
		LinkedHashSet<String> ss=new LinkedHashSet<String>();
		
		for (int j = 0; j < spliedSentance.length; j++) {
		
			if ( spliedSentance[j].length() >=maxlength.length()) {
				
				maxlength=spliedSentance[j];
				
				
				
			}
			
			
			
		
			
		}
		
		
		
		
		System.out.println(maxlength);	
		
		
	}
	
	
	

}
