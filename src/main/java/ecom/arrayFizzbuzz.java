package ecom;

import java.util.ArrayList;

public class arrayFizzbuzz {
	
	
	
	public static void main(String[] args) {
		
		
	System.out.println(	ddd(30));
		
		
	}
	
	public static ArrayList<String> ddd(int n) {
		
	//	int arr[]=new int[6];
		
		ArrayList<String> al=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			
			if(((i%3)==0)&&((i%5)==0)) {
				al.add("fizzbuzz");
			}
			else if((i%5)==0) {
				al.add("buzz");
			}
			else if	((i%3) ==0){
				al.add("fizz");
				
				
			}
			
			
			else {
				al.add(Integer.toString(i));
				//System.out.println(i);
			}
			
		
			
			
		}
		
		return al;
		//System.out.println(al);
		
	}

	
}
