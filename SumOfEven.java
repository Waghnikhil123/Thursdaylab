package corejavaproject;
import java.util.Scanner;
public class SumOfEven {
	public static void main(String [] args)
	{
		int i,sum=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		n= sc.nextInt();
		for(i=0;i<=n;i=i+2)
		{
			sum=sum+i;
			
		}
		System.out.println("sum of even number is "+sum);
	}

}
