package Stringlab;

import java.util.Scanner;

public class SearchLetter {

	public static void main(String[] args) {
		String input="mumbai";
		char ch='e';
		int flag=0;

		
		for(int i=0;i<input.length();i++)
		{

			if(ch==input.charAt(i))
			{
				System.out.println("elements e found at  "+i+" position");
				 flag=1;

			}
			
		}
		if(flag==0) {
			System.out.println("e not found found in mumbai" );
		}
		
	}

}
