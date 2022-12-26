package Thursdaylab;

import java.util.Scanner;

public class RemoveElementFromArray {
static Scanner sc=new Scanner(System.in);
	
	public static int[] setArray(int size)
	{
		int arr[]=new int[10];
		int i,num;
		System.out.println("enter "+size+" elements in array");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void DeleteFromSpecificPosition(int arr[],int size)
	{
		int i;
		
		System.out.println("printing element before search");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nEnter position ");
		int pos =sc.nextInt();
		//checking position for delete are correct or not
		 if(pos>size|| pos<0||pos==size)
		 {
			 System.out.println("please insert postion between range ");
		 }
		 else
		 {
			 System.out.println("\nEnter element you want delete  from specific position ");
				int element =sc.nextInt(); 
				for( i=arr.length-1;i>pos-1;i--)
				{
					arr[i]=arr[i-1];
				}
				System.out.println("printing element after deleting element from specific position");
				for(i=0;i<size;i++)
				{
					System.out.print(arr[i]+" ");
				}
		 }
		 
		
		
	}
	

	public static void main(String[] args) {
		int arr[],size;
		arr=setArray(10);
		DeleteFromSpecificPosition( arr,10);
		
	}

}
