import java.util.*;
class AVLTree<K extends Comparable<K>,V>
{
    public TreeMap<K,V> treemap;
    AVLTree()
    {
        treemap=new TreeMap();
    }
    void insert(K key,V value)
    {
        treemap.put(key,value);
    }
    public void delete(K key)
    {
        if(treemap.containsKey(key))
           treemap.remove(key);
        else
           System.out.println("not found in the tree");
    }
    public V search(K key)
    {
      return  treemap.get(key);
    }
    public void inorder()
    {
        for(Map.Entry m:treemap.entrySet())
        {
            System.out.println(m.getKey()+":"+m.getValue());
        }
    }
}
class Avl
{
    public static void main(String[] args)
    {
        AVLTree t=new AVLTree();
        t.insert(10,"a");
        t.insert(20,"b");
        t.insert(30,"c");
        t.insert(40,"d");
        t.inorder();
        System.out.println(t.search(90));
       t.delete(30);
       t.inorder();
       t.delete(50);
    }
}