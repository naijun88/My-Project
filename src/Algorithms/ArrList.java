package Algorithms;

import java.util.ArrayList;

public class ArrList {
	public static void main(String args[]){
		ArrayList<String> obj = new ArrayList<>();
		obj.add("Ajett");// add( Object o)
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");
		System.out.println("Currently the array list has following elements:"+obj);

		obj.add(0, "Monday");//add(int index, Object o)
		obj.add(1, "Tuesday");
		System.out.println("Currently the array list has following elements:"+obj);

		obj.remove(0);//remove(Object o)
		System.out.println("Currently the array list has following elements:"+obj);

		obj.remove(1);//remove(int index)
		System.out.println("Currently the array list has following elements:"+obj);


		obj.set(2, "added");//add one element
		System.out.println("Currently the array list has following elements:"+obj);

		System.out.println(obj.size());//Number of elements of the list.
		System.out.println(obj.get(3));// It returns the object of list
		System.out.println(obj.indexOf("Steve"));

		System.out.println(obj.set(4, "addlast"));//replace of one element
		System.out.println("Currently the array list has following elements:"+obj);


		obj.removeAll(obj);//remove all elements in the array
		System.out.println("Currently the array list has following elements:"+obj);

		obj.clear();//=obj.removeAll(obj)
		System.out.println("Currently the array list has following elements:"+obj);

		boolean v = obj.contains(1);
		System.out.println(v);

		}
}
