package ecom;

public class frquncy {
	
	public static void  freq(String str,String word) {
		
		
	String[] values = str.split(" ");
		int count=0;
		
		for (int i = 0; i < values.length; i++) {
			
			if (values[i].equals(word)) {
				
				count++;
				
			}
			
			
		}
		
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		
		String str= "dhanush mm dhanush nnn dhanush"; 
		String word="dhanush";
		freq(str,word);
	}
	
	
	

}
