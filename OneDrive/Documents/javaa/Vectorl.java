import java.util.*;
class Vectorl
{
  public static void main(String[] args)
  {
     Vector<String> v=new Vector();
     v.add("a");
     v.add("b");
     v.add("c");
     v.add("d");
     System.out.println(v);
    v.add(2,"x");
     System.out.println(v);
     System.out.println(v.get(1));
     v.remove(3);
     v.contains("a");
      System.out.println(v.size());
     v.clear();
     System.out.println(v);
 }
} 