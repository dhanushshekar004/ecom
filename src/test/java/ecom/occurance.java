package ecom;

import java.util.ArrayList;
import java.util.HashSet;

public class occurance {
	
	public static void main(String[] args) {
		
		int a[]= {2,3,4,4};
		HashSet aa=new HashSet();
		
		
		for (int i = 0; i < a.length; i++) {
			aa.add(a[i]);
		}
			
		for (Object object : aa) {
			int count=0;
			
			for (int i = 0; i < a.length; i++) {
				if (object.equals(a[i])) {
					count++;
				}
				
			}
			
			
		System.out.println(count +"  "+ object);
		}
		
		
		
		}
		
		
	}


