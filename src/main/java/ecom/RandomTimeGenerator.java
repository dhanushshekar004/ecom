package ecom;


	import java.util.Random;

	public class RandomTimeGenerator {
	    public static void main(String[] args) {
	    	String returndata = ddd(24);
	    	System.out.println(returndata);
	    	
	    	
	    }
	    public static String ddd(int time) {
	        // Create a Random object
	        Random random = new Random();
	        
	        // Generate random values for hours, minutes, and seconds
	        int hours = random.nextInt(time);   // Generates a number between 0 and 23
	        int minutes = random.nextInt(60); // Generates a number between 0 and 59
	        int seconds = random.nextInt(60); // Generates a number between 0 and 59

	        // Format the values to ensure two digits for hours, minutes, and seconds
	        String randomTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);

	        // Output the generated random time
	      //  System.out.println("Random Time: " + randomTime);
	        
	        return randomTime;
	    }
	}


