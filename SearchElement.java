package arrayexamples;
import java.util.Scanner;
public class SearchElement {
	//Declaring class variables
	int i;
	static int size, search;
	//Method to search Element in the array
	public void Sesrch(int selement,int array1[]) {
		int info=0;//local variable
		
		for(i=0;i<array1.length;i++) {
			
			if(selement==array1[i]) //Checking the position of searched element
			{
		System.out.println("element found at position: "+(i+1));
		info=1;
			}
		}
		if(info==0) //printing if not found
		{
			System.out.println(+selement+" is not found in the array");
		}
	}
	

	public static void main(String[] args) {
		System.out.println("Enter the size of Array");
		Scanner sc=new Scanner(System.in);
		//Receive size of the array
		size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter elements in the Array: ");
		
		//loop to insert elements in the array
		for(int i=0;i<size;i++) {
			
			array[i]=sc.nextInt();
		}
		System.out.println("Enter elements to Search in the array: ");
		search=sc.nextInt();
		SearchElement ser=new SearchElement();//instantiating SearchElement
		ser.Sesrch(search, array); //calling method Search
	}

}
