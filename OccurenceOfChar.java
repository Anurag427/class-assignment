package string;

import java.util.Scanner;

public class OccurenceOfChar {

	public static void main(String[] args) {
		String sentence;
		int i,count=0;
		char cheack;
		 
			      System.out.println("Enter a sentence :");
			      Scanner sc = new Scanner(System.in);
			     sentence = sc.nextLine();
			      System.out.println("Enter a charecter to cheack Occurence in string :");
			      cheack=sc.next().charAt(0);
			      for (i=0 ; i<sentence.length(); i++){
			         if(cheack == sentence.charAt(i)){
			        	count++;
			        	
			         }
			      }
			      System.out.println("given charecter "+cheack+" is prsent " +count+" Times"); 
			  
}

	}

