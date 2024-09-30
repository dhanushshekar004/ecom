package ecom;

public class merge_to_array {
	public static void main(String[] args) {

		String a[] = { "a", "b", "c" };
		String c[] = { "d", "e", "f" };
		String t[] = new String[a.length + c.length];
         int index=0;
		for(int i=0;i<a.length;i++)
		{
			t[index++]=a[i];
			t[index++]=c[i];
			
			
			
		}
		for(String vv:t) {
			System.out.print(vv);
		}
		
		
		for(int i=0;i<t.length;i++) {
			
			
			System.out.println(t[i]);
		}
		
		
	}

}
