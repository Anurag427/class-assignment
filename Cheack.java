package corejava;

import java.util.Scanner;

public class Cheack {

	public void cheackNum(int x ,int y,int z) { // creating method to check greatest number
		
		if((x!=y)&&(y!=z)) // checking is numbers are equal or not
		{
		if(z!=x)
		{
			if((x>z) && (x>y)) {
				
				System.out.println("x: " +x+" is greater");
				
			}
			
			
		else if((y>x) && (y>z))
		{

			System.out.println("y: " +y+" is greater");
			
			}
		else if((z>x) && (z>y))
		{
			System.out.println("z: " +z+" is greater");
		}
			}	
		}
		else {
			System.out.println("you have entered same numbers");
		}
		}
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);//creating object for scanner
		System.out.println("Enter three numbers to cheack which one is greater");
		// taking input from user
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		 Cheack ch= new Cheack();// creating object for cheack class
		 ch.cheackNum(a,b,c);// calling method cheacknum to cheack greatest number
			
		}
}
