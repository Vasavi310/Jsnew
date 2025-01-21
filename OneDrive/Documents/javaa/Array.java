import java.util.*;
class Array
{
    public static void main(String[] args)
    {
         ArrayList<Integer> l=new ArrayList<>();
         l.add(1);
         l.add(2);
         l.add(3);
         Iterator<Integer> it=l.iterator();
         while(it.hasNext())
         {
            System.out.println(it.next());
         }
         LinkedList<Integer> l1=new LinkedList<>();
         l.add(9);
         l.add(8);
         l.add(7);
         Iterator<Integer> it1=l.iterator();
         while(it1.hasNext())
         {
            System.out.println(it1.next());
         }
    }
}