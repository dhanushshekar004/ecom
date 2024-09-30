package ecom;

public class To_add_only_even_numbers {
	
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		
		for(Integer i:a)
		{
			int sum=0;
			if(a[i]%2==0)
			{
				sum=sum+a[i];
				System.out.println(sum);
			}
		}
		
	}
	

}
