package collection;

import java.util.TreeSet;

public class TreeSetExample {
public static void main(String[] args)
{
	TreeSet<String> tset = new TreeSet<String>();
	tset.add("ABC");
    tset.add("String");
    tset.add("Test");
    tset.add("Pen");
    tset.add("Ink");
    tset.add("Jack");
    System.out.println(tset);
    
    TreeSet<Integer> tset2 = new TreeSet<Integer>();
    tset2.add(88);
    tset2.add(7);
    tset2.add(101);
    tset2.add(0);
    tset2.add(3);
    tset2.add(222);
    System.out.println(tset2);
	
}
/*TreeSet is similar to HashSet except that it sorts the elements in the ascending order while 
HashSet doesn’t maintain any order. */
}
