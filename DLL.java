import java.util.Scanner;
public class Main
{
    static class Node{
        int data;
        Node next;
        Node prev;
        
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    Node tail=null;
    
    
    public void create()
    {   
        int data, n, x;
        Scanner sc=new Scanner(System.in);
       
        do
        {
            System.out.println("Enter Data: ");
            data=sc.nextInt();
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else
            {   
                System.out.print("1.insert at biginning  2. insert at end  3. insert at serten position");
                n=sc.nextInt();
                switch(n)
                {
                    case 1:
                        head.prev=newNode;
                        newNode.next=head;
                        head=newNode;
                    break;
                    
                    case 2:
                        tail.next=newNode;
                        newNode.prev=tail;
                        tail=newNode;
                    break;
                    
                    case 3:
                        Node temp=head;
                        Node ptr=temp.next;
                        System.out.println("Enter position where do you want to add data");
                        x=sc.nextInt();
                        for(int i=0;i<(x-1);i++)
                        {
                            temp=temp.next;
                            ptr=ptr.next;
                        }
                        temp.next= newNode;
                        newNode.prev=temp;
                        newNode.next=ptr;
                        ptr.prev=newNode;
                        
                        
                    break;
                }
            }
            System.out.println("add data: press: 1");
            n=sc.nextInt();
        }while(n==1);
        
    }
    
    
    public void delete()
    {   int a, n, x;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("1. delete at biginning  2. delete at end  3. delete at sertain position");
            a=sc.nextInt();
            switch(a)
            {
                case 1:
                    head=head.next;
                    tail=head;
                    head.prev=null;
                break;
                
                case 2:
                    Node temp=tail;
                    temp=tail.prev;
                    temp.next=null;
                    tail=temp;
                    
                break;
                
                case 3:
                    Node temp1=head;
                    Node ptr=temp1.next;
                    System.out.println("Enter position where do you want to add data");
                        x=sc.nextInt();
                        for(int i=0;i<(x-1);i++)
                        {
                            temp1=ptr;
                            ptr=ptr.next;
                        }
                        temp1.next=ptr.next;
                        ptr.next.prev=temp1;
                break;
            }
             System.out.println("add data: press: 1");
            n=sc.nextInt();
        }while(n==1);
        
    }
    
    public void traverse(){
        Node temp=head;
        if(head==null)
        {
            System.out.println("ll Not exiest");
        }
        else
        {
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main m= new Main();
		m.create();
		m.traverse();
		m.delete();
		m.traverse();
		
	}
}
