package Stringlab;

public class ReverseString
{
	public static void main(String[] args) 
	{
		String input="welcome";
	/*StringBuffer buffer=new StringBuffer("welcome");   
	buffer.reverse();  
	System.out.println(buffer);
	*/
		//or
		System.out.print("revese of string is \n");
		for(int i=input.length()-1;i>=0;i--)
		{

	
				System.out.print(input.charAt(i));
			
		}
	

	}

}
