package ecom;

import java.util.ArrayList;
import java.util.HashSet;

public class wwww {
	
	
	
	public static void main(String[] args) {
		
		
	int a[]= {1,2,3,4,4,4,5,5,3,3,2,1};
		int alength = a.length;
	
		System.out.println(alength);
	HashSet<Integer> aa=new HashSet();
	
for (int i = 0; i < a.length; i++) {
	
	aa.add(a[i]);
	
	
	
}
System.out.println(aa);
for (Integer object : aa) {
	int count=0;
	{
		for (int i = 0; i < a.length; i++) {
			
			if (object.equals(a[i])) {
				count++;
				
				
			}
			
		}
		
		

	}
	System.out.println(count+"  "+ object);	
	
}
		
		
		
		
		
		
		
		
	}

}
