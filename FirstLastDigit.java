package corejavaproject;
import java.util.Scanner;
public class FirstLastDigit {
	public static void main(String [] args)
	{
		int L,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n= sc.nextInt();
		L=n;
		L=L%10;
		while(n>10)
		{
			n=n/10;
			
		}
		System.out.println("first digit is "+ n +" last digit is "+L);
	} 
 
}
