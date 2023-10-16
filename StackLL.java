import java.util.Scanner;
public class Main
{
    
     static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    
    public void create()
    {
        int data;
        int n;
        Scanner sc=new Scanner(System.in);
        
        do
        {
             System.out.println("Enter data");
            data=sc.nextInt();
            Node newNode=new Node(data);
           
            if(top==null)
            {
                top=newNode;
            }
            else{
                newNode.next=top;
                top=newNode;
            }
            System.out.println("Do you want add more data press: 1 ");
            n=sc.nextInt();
        }while(n==1);
    }
    
    public void delete()
    {
        int n,p;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("do you want to delete data press: 1 ");
            p=sc.nextInt();
            if(p==1)
            {
                if(top==null)
                {
                     System.out.println("LinkList not exiest");
                }
                else
                {
                    top=top.next;
                }
                
            }
            System.out.println("Do you want delete more data press: 1 ");
            n=sc.nextInt();
        }while(n==1);
    }
    
    public void traverse()
    {   Node temp=top;
        if(top==null)
        {
            System.out.println("LinkList not exiest");
        }
        else{
            do
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while(temp!=null);
        }
    }
        
    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main m=new Main();
		m.create();
		m.traverse();
		m.delete();
		m.traverse();
		
	}
}
