import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class BST
{
    Node root;
    BST()
    {
        root=null;
    }
    public void insert(int data)
    {
        root=insert(root,data);
    }
    Node insert(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(data<root.data)
          root.left=insert(root.left,data);
        else if(data>root.data)
          root.right=insert(root.right,data);
        return root;
    }
    public void delete(int data)
    {
        root=delete(root,data);
    }
    public Node delete(Node root, int data) {
    if (root == null)
        return null;
    if (data < root.data)
        root.left = delete(root.left, data);
    else if (data > root.data)
        root.right = delete(root.right, data);
    else {
        if (root.left == null)
            return root.right;
        else if (root.right == null)
            return root.left;
        root.data = minvalue(root.right);
        root.right = delete(root.right, root.data);
    }
    return root; // Make sure to return the root node after deletion
}

    public int minvalue(Node root)
    {
        int minv=root.data;
        while(root.left!=null)
        {
            root=root.left;
            minv=root.data;
        }
        return minv;
    }
    public void inorder()
    {
        inorder(root);
    }
    public void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
}
class Binarystree
{
    public static void main(String[] args)
    {
        BST t=new BST();
        t.insert(9);
        t.insert(3);
        t.insert(2);
        t.insert(20);
        t.inorder();
    }
}