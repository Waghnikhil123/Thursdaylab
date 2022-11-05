package corejavaproject;
import java.util.Scanner;
public class FactorialNum {
	public static void main(String[] args)
	{
		int n,f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		n= sc.nextInt();
		
		while(n>0)
		{
		f=f*n;
		n--;
			
		}
		System.out.println("factorial of given number is "+f);
	}

}
