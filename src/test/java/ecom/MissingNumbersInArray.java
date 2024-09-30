package ecom;


	public class MissingNumbersInArray {

		public static void main(String[] args) {
			
		
			int[] a={1,4,9,7,8};
			//create array with same length0
			//by default all index will will contain zero
			//default value for int variable
			System.out.println(a.length);
			
			int[] arr= new int[11];
			//iterate over given array to mark all
			//to mark all present no. in  arr array
			
			for (int i : a) {
				arr[i]=1;
				}
			/*for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}*/
			
			
		//print all absentees
				for(int i=1;i<arr.length;i++)
				{
					if(arr[i]==0)
				{
						System.out.println(i);
					}
				}
				
			}

		}
		


