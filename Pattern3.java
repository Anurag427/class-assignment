package corejava;


import java.util.Scanner;

/**
 * @author ANURAG-PC
 *
 */
public class Pattern3 {

		public static void main(String[] args) {
			int n, i,j,temp=0,h; //declaring variables
			System.out.println("eneter limit upto you wnt to see pattern");
			Scanner sc=new Scanner(System.in);  // creating object for scanner class
			n=sc.nextInt(); //taking limit upto pattern will print
			
			//printing pattern
			for(i=1;i<=n;i++) {
				
				for(j=i;j>1;j--) {
					temp=temp+1;
				
					System.out.print(temp+" ");
					
				}
				System.out.println("");
				
				
			}

}}

