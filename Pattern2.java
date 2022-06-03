package corejava;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		int n,i,j; //declaring variables
		
		System.out.println("eneter limit upto you wnt to see pattern");
		
		Scanner sc=new Scanner(System.in);  // creating object for scanner class
		n=sc.nextInt(); //taking limit upto pattern will print
		
		//printing pattern
				for(i=1;i<=n;i++) {
					for(j=i;j>=1;j--) {
						
				System.out.print("*");
						
					}
					
					System.out.println("");
				}
		

	}

}
