package ecom;

import java.util.HashSet;

public class SumOfDigitOfString {
	public static void main(String[] args) {
		
	
	
	String ss="a1b2c3";
	int sum = 0;
	int length = ss.length();
	
	HashSet ssw=new HashSet();
	
for(int i=0;i<length;i++)
{
	if(ss.charAt(i)>='0' && ss.charAt(i)<='9')
	{
		int n=ss.charAt(i)-48;
		
		sum=sum+n;
	}
	
	
}
System.out.println(sum);}
}