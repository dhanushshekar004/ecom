package ecom;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayComplex {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array size");
		int arraySize=sc.nextInt();
		 int[] arrayName=new int[arraySize];
		 
		 
		 System.out.println("To enter the number into the array");
		
		for (int i = 0; i < arraySize; i++) {
			 arrayName[i]=sc.nextInt();
		}
		
		
		int maxnumber=arrayName[0];
		System.out.println(maxnumber);
		
		for (int i = 0; i < arraySize; i++) {
			if (arrayName[i]>maxnumber);
			maxnumber=arrayName[i];
		}
		
		System.out.println(maxnumber);
		
		
		System.out.println(arrayName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
