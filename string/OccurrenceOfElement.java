package Stringlab;

import java.util.Scanner;

public class OccurrenceOfElement {

	public static void main(String[] args) {
		String input;
		char ch;
		int occurance=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");
		input=sc.nextLine();
		System.out.println("enter a element to find out Occurrence of element ");
        ch=sc.next().charAt(0);

		
		for(int i=0;i<input.length();i++)
		{

			if(ch==input.charAt(i))
			{
				occurance++;

			}
		}
		System.out.println("element "+ch+" occures "+occurance+" times");

	}

}
