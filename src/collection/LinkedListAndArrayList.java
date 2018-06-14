package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAndArrayList {
	public static void main(String[] args){
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("Monday");
		obj.add("Tuesday");
		obj.add("Wednesday");
		obj.add("Thursday");
		obj.add("Friday");
		System.out.println(obj);
		obj.addFirst("First");
		obj.addLast("Last");
		System.out.println(obj);
		System.out.println(obj.get(0));
		
		ArrayList<String> obj1 = new ArrayList<String>();
		obj1.add("Wednesday");
		obj1.add("Thursday");
		obj1.add("Friday");
		System.out.println(obj1);
		System.out.println(obj1.get(1));	

	}
}
/*
ArrayList and LinkedList both implements List interface and their methods and results are almost identical.
However there are few difference.
1. for Search method, ArrayList is faster than LinkedList.
2. for insertion and deletion LinkedList is faster than ArrayList.
Conclusion: 
if there is a requirement of frequent addition and deletion in application then LinkedList is a best choice.
If there are less add and remove operations and more search operations requirement, ArrayList would be your best choice.

*/
