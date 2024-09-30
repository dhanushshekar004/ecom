package ecom;

import java.util.Iterator;

public class Pattren3 {
public static void main(String[] args) {
	char b;
	//char alp=b;
	int a=1;
	int num=6;
	for (int i = 0; i < num; i++) {
		for (int j = 0; j < num; j++) {
			if (i+j<num-1) {
				if (i%2==0) {
					System.out.print(a+" ");
					a++;
				} else {
					System.out.print("*"+" ");
					
				}
				
				
			}
			
		}
		System.out.println();
		
	}
	int num2=6;
	for (int i = 0; i < num; i++) {
		for (int j = 0; j < num; j++) {
			if (i>=j) {
				
			
			System.out.print("*");
		}	
				}
		System.out.println();	
	}
	
	
}
}
