package corejava;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		int n; // Declaring variable
		
		System.out.println("enter limit upto you want see even no");
		Scanner sc=new Scanner(System.in); //creating object for scanner class
		n=sc.nextInt(); //taking input from user
		
		for(int i=1;i<=n;i++) {//to print even number
			if(i%2==0) { //checking even or not 
			System.out.println(i);
		}
	}

}
}