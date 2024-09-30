package ecom;


	
	public class test {
	    public static void main(String[] args) {
	        String input = "aaabbccdaa"; // aaabcdaaa
	        StringBuilder output = new StringBuilder();
	        
	        int count = 1;//3
	        for (int i = 1; i < input.length(); i++) {
	            if (input.charAt(i) == input.charAt(i - 1)) {
	                count++;
	            } else {
	                output.append(count).append(input.charAt(i - 1));
	                count = 1;
	            }
	        }
	        // Append the last set of characters
	        output.append(count).append(input.charAt(input.length() - 1));
	        
	        System.out.println(output.toString());
	    }
	


}
