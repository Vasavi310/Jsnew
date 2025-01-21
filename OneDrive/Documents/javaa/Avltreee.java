import java.util.*;
class Node<T extends Comparable<T>>
{
    T data;
    Node<T> left,right;
    int height;
    Node(T data)
    {
        this.data=data;
        left=right=null;
        height=1;
    }
}
class AVLTree<T extends Comparable<T>>
{
    Node<T> root;
    AVLTree()
    {
        root=null;
    }
    public int height(Node<T> root)
    {
        if(root==null)
          return 0;
        return root.height;
    }
    public int getbal(Node<T> root)
    {
        if(root==null)
          return 0;
        return height(root.left)-height(root.right);
    }
    public void insert(T data)
    {
        root=insert(root,data);
    }
    public Node<T> insert(Node<T> root,T data)
    {
        if(root==null)
           return new Node<>(data);
        if(data.compareTo(root.data)<0)
           root.left=insert(root.left,data);
        else if(data.compareTo(root.data)>0)
           root.right=insert(root.right,data);
        else
           return root;
        root.height=height(root.left)+height(root.right)+1;
        int bal=getbal(root);
        if(bal>1 && data.compareTo(root.left.data)<0)
           return rightr(root);
        if(bal<-1 && data.compareTo(root.right.data)>0)
           return leftr(root);
        if(bal>1 && data.compareTo(root.left.data)>0)
        {
            root.left=leftr(root.left);
            return rightr(root);
        }
        if(bal<-1 &&data.compareTo(root.left.data)<0)
        {
            root.right=rightr(root.right);
            return leftr(root);
        }
        return root;
    }
    public Node<T> rightr(Node<T> y)
    {
        Node<T> x=y.left;
        Node<T> T2=x.right;
        x.right=y;
        y.left=T2;
        y.height=Math.max(height(y.left),height(y.right))+1;
        x.height=Math.max(height(x.left),height(x.right))+1;
      return x;
        
    }
    public Node<T> leftr(Node<T> x)
    {
        Node<T> y=x.right;
        Node<T> T2=y.left;
        y.left=x;
        x.right=T2;
        x.height=Math.max(height(x.left),height(x.right))+1;
        y.height=Math.max(height(y.left),height(y.right))+1;
       return y; 
    }
    public void inorder()
    {
        inorder(root);
    }
    public void inorder(Node<T> root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
    }
    
}
class Avltreee
{
    public static void main(String[] args)
    {
        AVLTree<Integer> t=new AVLTree<>();
        t.insert(1);
        t.insert(2);
        t.insert(3);
        t.inorder();
    }
}