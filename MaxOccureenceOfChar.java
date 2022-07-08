package string;

import java.util.Scanner;

public class MaxOccureenceOfChar {

	public static void main(String[] args) {
		String sentence;
		int i,count=1,max=0;
		char cheack,store;
		 
			      System.out.println("Enter a sentence :");
			      Scanner sc = new Scanner(System.in);
			     sentence = sc.nextLine();
			     store=sentence.charAt(0);
			      for (i=0 ; i<sentence.length(); i++)
			      {
	             count=1;
			    	  cheack=sentence.charAt(i);
			    	  for(int j=i+1;j<sentence.length();j++)
			         if(cheack == sentence.charAt(j)&&cheack!=' '){
			        	 ++count;
			        	
			        	if(max<count)  {
			        		max=count;
			        		store=sentence.charAt(i);
			        		
			         }
			      }
			      }
			      System.out.println("charecter "+store+" is prsent maximum " +max+ " Times"); 
}

	}