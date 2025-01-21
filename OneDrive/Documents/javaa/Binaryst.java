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
        root=insertRec(root,data);
    }
    Node insertRec(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
        }
        if(data<root.data)
           root.left=insertRec(root.left,data);
        else if(data>root.data)
           root.right=insertRec(root.right,data);
        return root;
    }
    void inorder()
    {
        inorderRec(root);
    }
    void inorderRec(Node root)
    {
        if(root!=null)
        {
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }
    void preorder()
    {
        preorderRec(root);
    }
    void preorderRec(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    void postorder()
    {
        postorderRec(root);
    }
    void postorderRec(Node root)
    {
        if(root!=null)
        {
            preorderRec(root.left);
            preorderRec(root.right);
            System.out.print(root.data+" ");
        }
    }
}
class Binaryst
{
    public static void main(String[] args)
    {
        BST t=new BST();
        t.insert(50);
        t.insert(30);
        t.insert(20);
        t.insert(40);
        t.insert(70);
        t.insert(60);
        t.insert(80);
        t.inorder();
        System.out.println();
        t.preorder();
        System.out.println();
        t.postorder();
    }
    
}