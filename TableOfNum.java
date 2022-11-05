package corejavaproject;
import java.util.Scanner;
public class TableOfNum {
	public static void main(String []args)
	{
		int i,n, mul=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
		n=sc.nextInt();
	    System.out.println("multiplication table of "+n+" is");

		for(i=1;i<=10;i++)
		{
			mul=n*i;
			System.out.println(mul);
			
		}
		
	}

}
