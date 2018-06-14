package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
public static void main(String[] args)
{
	LinkedHashSet<String> lhset = new LinkedHashSet<String>();
	  lhset.add("Z");
      lhset.add("PQ");
      lhset.add("N");
      lhset.add("O");
      lhset.add("KK");
      lhset.add("FGH");
      System.out.println(lhset);
}
/*HashSet doesn’t maintain any kind of order of its elements.
  TreeSet sorts the elements in ascending order.
  LinkedHashSet maintains the insertion order. Elements gets sorted in the same sequence 
  in which they have been added to the Set.*/
}
