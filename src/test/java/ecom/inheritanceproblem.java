package ecom;

public class inheritanceproblem {
	
	static String Username;
	static String ID;
	public inheritanceproblem(String Username,String ID) {
		
		this.Username=Username;
		this.ID=ID;
	}
		public void displayInfo() {
			
			System.out.println("UserName"+Username);
			System.out.println("ID"+ID);
		}
		
	
	

}
 class student extends inheritanceproblem {
	
	String studentName;
	public student(String studentName) {
		super(Username,ID);
		this.studentName=studentName;
	}
	
 

	 public static void main(String[] args) {
		 inheritanceproblem d=new inheritanceproblem("Dhanush","444");
		 
		 d.displayInfo();
	}


 }

