package string;
import java.util.Scanner;

public class CharPosition {

	public static void main(String[] args) {
		
		String sentence;
			int i;
			char cheack;
			boolean a=false;
				      System.out.println("Enter a sentence :");
				      Scanner sc = new Scanner(System.in);
				     sentence = sc.nextLine();
				      System.out.println("Enter a charecter to cheack where its prsent :");
				      cheack=sc.next().charAt(0);
				      for (i=0 ; i<sentence.length(); i++){
				         if(cheack == sentence.charAt(i)){
				        	 System.out.println("cheracter "+cheack+" is present at "+i);
				        	 a=true;
				         }
				      }
				      if(!a) {
				    	  System.out.println("there is No "+cheack+" is present in the sentence");
				      }
	}
}
				        
				     
		

