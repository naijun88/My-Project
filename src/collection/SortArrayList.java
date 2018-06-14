package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
public static void main(String[] args)
{
	ArrayList<String> obj = new ArrayList<String>();
	obj.add("China");
	obj.add("America");
	obj.add("Russa");
	obj.add("Japan");
	
	/*Unsorted List*/
	System.out.println("Before Sorting:");
	for(String s : obj)
		System.out.print(s+" ");
	
	/* Sort statement*/
	Collections.sort(obj);
	
	/* Sorted List*/
	System.out.println("After Sorting:");
	for(String t : obj)
		System.out.print(t+" ");
}

}
