package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetExample {
	public static void main(String[] args)
	{
		HashSet<String> hset = new HashSet<String>();
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
	    hset.add("Orange");
	    hset.add("Orange");//it not allow duplicate element
	    hset.add(null);
	    System.out.println(hset);
	    boolean v = hset.contains("Pineapple");
	    System.out.println(v);
	    hset.clear();//remove all element
	    System.out.println(hset.size());
	    hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
	    hset.add("Orange");
	    for(String s : hset)
	    	System.out.println(s);//Iterate the HashSet: Converting a HashSet to an Array
	    
	    //or Iterate Hashset by using Iterator
	    Iterator<String> it = hset.iterator();
	    while(it.hasNext())
	    	System.out.println(it.next());
	    
	    //Convert HashSet to a List/ArrayList
	    List<String> list = new ArrayList<String>(hset);
	    System.out.println("ArrayList contains: "+ list);//ArrayList can not contain null element.
	}
}
