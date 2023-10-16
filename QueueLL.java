import java.util.Scanner;
public class Main
{
    static class Node
    {
        int data;
        Node next;
        
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node front=null;
    Node rear=null;
    
    public void enQueue()
    {
         int data, n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter data");
        data=sc.nextInt();
        Node newNode= new Node(data);
       
            if(front==null && rear==null)
            {
               front=newNode;
               rear=newNode;
            }
            else
            {
                rear.next=newNode;
                rear=newNode;
            }
       
    }
    
    public void deQueue()
    {
        if(front==null)
        {
            System.out.println("Queue UnderFlow");
        }
        else
        {
            front=front.next;
        }
    }
    
    public void Display()
    {
        Node temp=front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		Main m=new Main();
		int a;
		do
		{
		System.out.println("1.enQueue data  \n2.deQueue data  \n3.Display data");
		int x=sc.nextInt();
		
		switch(x)
		{
		    case 1:
		        m.enQueue();
		    break;
		    
		    case 2:
		        m.deQueue();
		    break;
		    
		    case 3:
		        m.Display();
		    break;
		}
		System.out.println("main menu   press 1");
		a=sc.nextInt();
		}while(a==1);
	}
}
