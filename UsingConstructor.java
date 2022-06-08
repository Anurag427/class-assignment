package OOPs;

class StudentDetails1{
	//delearing instance variables 
	int studentId;
	String studentName;
	String studentAddress;
	long phNo;
	
	public StudentDetails1( int studentId ,String studentName,String studentAddress,long phNo)//Initializing variables with help of method
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress= studentAddress;
		this.phNo=phNo;
		
		System.out.println("studentid:" +studentId+" "+"studentname: "+studentName+" "+
				"student address: "+studentAddress+" "+"student phone no."+" "+phNo);
				
	
}
}
public class UsingConstructor {
public static void main(String[] args) {
		
		StudentDetails1 anu=new StudentDetails1(12,"anurag", "sealdah", 9062287); //creating object for StudentDetails class
		 //calling getData method
		StudentDetails1 anu1=new StudentDetails1(123,"anurag", "sealdah", 9062287);
}
}