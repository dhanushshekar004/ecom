package ecom;

public class add_to_array {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,4,5,7,89,6,3};
		int b[]= {3,4,6,88,8,4};
		
		int length=b.length;
		System.out.println(length);
		
		if(a.length>b.length)
			
		{
		length=a.length	;
		}
		
		System.out.println(length);
		
		for(int i=0;i<length;i++)
		{
			try {int c=a[i]+b[i];
				if(c<9) {
				
				System.out.print(c+" ");
				}
				else
					{
					int x=c%10;
					System.out.println(x);
					int y=c/10;
					System.out.println(y);
					}
					
					} catch (Exception e) {
					}
				// TODO: handle exception
		
			}
			
		}
		
		
		
	}

