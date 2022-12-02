package Arrayexample;
import java.util.Scanner;
public class MinAndMaxInArray {
	public static void main(String[] args)
	{
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter Size of Array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n]; 
	
		System.out.print("\n Enter elements in array ");
	for(i=0;i<n;i++)  
	{
		
		arr[i]=sc.nextInt();
	}
	int max=arr[0],min=arr[0];  //Initializing with first element.
	
	for(i=0;i<n;i++)
	{
		if(arr[i]>max)   //Checking Maximum element
		{
			max=arr[i];
		}
		if(arr[i]<min)  //Checking Minimum element
		{
		min=arr[i];
		}
	}
	//Printing Result
	System.out.println("\n Maximum Number: "+max);
	System.out.println("\n Minimum Number: "+min);
	}

}
