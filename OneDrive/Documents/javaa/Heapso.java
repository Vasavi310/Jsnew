import java.util.*;
class HeapSort
{
    public static void heap(int a[])
    {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:a)
          p.offer(n);
        int i=0;
        while(!p.isEmpty())
           a[i++]=p.poll();
    }
}
class Heapso
{
    public static void main(String[] args)
    {
        HeapSort h=new HeapSort();
        int a[]={3,4,6,8,9,1,45};
        System.out.println(Arrays.toString(a));
        h.heap(a);
        System.out.println(Arrays.toString(a));
        
    }
}