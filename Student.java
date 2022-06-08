package OOPs;
class StudentDetails{
	//delearing instance variables 
	int studentId;
	String studentName;
	String studentAddress;
	long phNo;
	
	public void setData( int id,String name,String address,long ph)//Initializing variables with help of method
	{
		studentId=id;
		studentName=name;
		studentAddress= address;
		phNo=ph;
		
		
	}
	//printing data's
	public void getData() { 
		System.out.println("studentid:" +studentId+" "+"studentname: "+studentName+" "+
	"student address: "+studentAddress+" "+"student phone no."+" "+phNo);
	}
}
public class Student {
	public static void main(String[] args) {
		
		StudentDetails anu=new StudentDetails(); //creating object for StudentDetails class
		anu.setData(12, "anurag", "sealdah", 9062287); //calling setData method
		anu.getData(); //calling getData method
		Book  b =new Book();
		b.setBookid(1);
		b.setBookName("anurag ");
		b.getBookName();
		System.out.println("book id: "+b.getBookid()+" "+"Booking name: "+b.bookName);
	}
	
	

}
