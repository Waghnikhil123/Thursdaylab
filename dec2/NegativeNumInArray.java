package Arrayexample;

public class NegativeNumInArray {
	public static void main(String[] args) {
		
		int[] arr = {-3,-2,-1,0,1,2,3,4};
		
		
		System.out.println("Negative Numbers in Array are: ");
		for(int j=0;j < arr.length;j++) 
		{
			if(arr[j] < 0) {
				System.out.println(arr[j]);
			}
			
		}
	}

}
