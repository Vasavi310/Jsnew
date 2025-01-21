import java.util.*;
class Maxheappriqueue<T extends Comparable<T>>
{
    public PriorityQueue<T> maxheap;
    Maxheappriqueue()
    {
        maxheap=new PriorityQueue<>(Collections.reverseOrder());
    }
    public void insert(T ele)
    {
        maxheap.offer(ele);
    }
    public boolean delete(T ele)
    {
        return maxheap.remove(ele);
    }
    public T emax()
    {
        return maxheap.poll();
    }
    public boolean isEmpty()
    {
        return maxheap.isEmpty();
    }
    public int size()
    {
        return maxheap.size();
    }
}
class Priority
{
    public static void main(String[] args)
    {
         Maxheappriqueue<Integer> m=new Maxheappriqueue<>();
         System.out.println("before");
         m.insert(2);
         m.insert(5);
         m.insert(7);
         m.insert(6);
         m.insert(9);
         while(!m.isEmpty())
         {
             System.out.println(m.emax()+" ");
         }
         Maxheappriqueue<Integer> m1=new Maxheappriqueue<>();
          m1.insert(2);
         m1.insert(5);
         m1.insert(7);
         m1.delete(5);
         m1.delete(7);
         System.out.println("after");
         while(!m1.isEmpty())
         {
             System.out.println(m1.emax()+" ");
         }
    }
}