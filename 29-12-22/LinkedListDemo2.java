package collection;

import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void main(String[] args) {

		 LinkedList<Integer> list1=new LinkedList<Integer>();
		 //add data in list
		 list1.add(10);
		 list1.add(20);
		 list1.add(30);
		 list1.add(40);
		 System.out.println("after adding element in linkedlist: "+list1);
		 
		 //add data in specific position
		 list1.add(4,50);
		 System.out.println("adding data in 4th position: "+list1);
		 
		 Integer first =list1.getFirst();                //retrieve first element
		 System.out.println("first element is: "+first);
		 
		 list1.set(0, 01);                                //replace 1st element
		 System.out.println("repace first element: "+list1);
		 
		 Integer[] array=list1.toArray(new Integer[list1.size()]);
		 System.out.println("array after conversion from linkedlist to array ");

		 for(int i=0;i<array.length;i++)
		 {
			 System.out.println(array[i]);
			 
		 }
	}
}
