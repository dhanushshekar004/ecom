package ecom;

public class pattren {

	
	
	public static void main(String[] args) {
		
		int fno=5;
		int lno=10;
		for(int i=0;i<fno;i++) {
			
			for(int j=0;j<fno;j++)
			{
				if(i>=j) {
					System.out.print("*");
				}
				
			}
			
		System.out.println();	
		}
for(int i=fno;i<lno;i++) {
			
			for(int j=0;j<lno;j++)
			{
				if(i<=j) {
					System.out.print("*");
				}
				
			}
			
		System.out.println();	
		}
		
	}
}
