package corejava;


import java.util.Scanner;

public class Pattern5 {
	
	

		public static void main(String[] args) {
			int n, i,j,k; //declaring variables
			System.out.println("eneter limit upto you wnt to see pattern");
			Scanner sc=new Scanner(System.in);  // creating object for scanner class
			n=sc.nextInt(); //taking limit upto pattern will print
			
			//printing pattern
			for(i=1;i<=n;i++) {
				for(j=n;j>=i;j--) {
				
					//printing space	
			System.out.print(" ");
					
				}
				for(k=1;k<=i;k++) {
					System.out.print("* "); //printing star
					
				}
				
				System.out.println(""); //printing next line
			}
			for(i=n;i>=1;i--) {
				
			
		
        for(j=i;j<n;j++) {
			
			//printing space	
	System.out.print(" ");
	}
			
			for(k=i;k>=1;k--) {
				System.out.print(" *"); //printing star
				
			
			}
					
				
				System.out.println(""); //printing next line
			}

		}

	}



