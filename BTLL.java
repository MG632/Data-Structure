import java.util.Scanner;
public class Main
{
    static class Node
    {
        int data;
        Node left, right;
        
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
            
        }
        
    }    
        
       static Node create()
        {
            int data;
            Scanner sc=new Scanner(System.in);
            data=sc.nextInt();
            if(data==-1)
            return null;
            Node root= new Node(data);
            System.out.println("Enter left side of :"+ root.data);
            root.left=create();
            System.out.println("Enter right side of :"+ root.data);
            root.right=create();
            return root;
        }
        
        static void preorder(Node root)
        {
            if(root == null)
            return;
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        
        static void inorder(Node root)
        {
            if(root == null)
            return;
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        
       static void postorder(Node root)
        {
            if(root == null)
            return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Enter the root node data:");
		Node root= create();
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
	    postorder(root);
	}
}