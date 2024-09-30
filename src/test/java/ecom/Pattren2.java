package ecom;

import java.util.Iterator;

public class Pattren2 {
public static void main(String[] args) {
	int a=1;
	int num=6;
	for (int i = 0; i < num; i++) {
		for (int j = 0; j < num; j++) {
			if (i+j<num-1) {
				System.out.print(a+" ");
				a++;
				
			}
			
		}
		System.out.println();
		
	}
	int num2=6;
	for (int i = 0; i < num2; i++) {
		for (int j = 0; j < num2; j++) {
			if (i>=j) {
				
			
			System.out.print("*");
		}	
				}
		System.out.println();	
	}
	
	
}
}
