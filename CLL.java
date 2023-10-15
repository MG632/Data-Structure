import java.util.Scanner;
public class Main
{   
  static class Node{
      int data;
      Node next;
       Node(int data){
          this.data=data;
          this.next=null;
      }
      
  }
      Node head=null;
      Node tail=null;
  public void createcl()
  {
      int data, n;
      
      Scanner sc=new Scanner(System.in);
      do{
      System.out.println("Enter data: ");
      data=sc.nextInt();
      Node newNode=new Node(data);
      if(head==null){
          head=newNode;
          tail=head;
          
      }
      
      else{
          System.out.println("1. insert at biginning   2. insert at end  3. insert at setain position");
          int m=sc.nextInt();
          switch(m)
          {
            case 1: 
                    newNode.next=head;
                    head=newNode;
                    tail.next=head;
            break;
            
            case 2:
                    tail.next=newNode;
                    tail=newNode;
                    tail.next=head;
            break;
            
            case 3:
                  Node temp1=head;
                  System.out.println("Enter position where do you want to add data");
                  int p =sc.nextInt();
                  for(int i=0; i<(p-1); i++)
                  {
                      temp1=temp1.next;
                  }
                  newNode.next=temp1.next;
                  temp1.next=newNode;
            break;
          }
      }
      System.out.println("do you want to add data");
      n=sc.nextInt();
      }while(n==1);
  }
  
  
  
  public void delete()
  { 
      Scanner sc= new Scanner(System.in);
      int y;
      if(head==null)
      {
         System.out.println("circular linklist does not exiest");
      }
      else
      { do
        {
          int n;
          System.out.println("1. delete at biginning   2. delete at end  3. delete at serten position");
          n=sc.nextInt();
          switch(n)
          {
              case 1:
                  head=head.next;
                  tail.next=head;
              break;
              
              case 2:
                  Node temp=head;
                  Node ptr=temp.next;
                  do
                  {
                      temp=ptr;
                      ptr=ptr.next;
                  }while(ptr!=tail);
                  temp.next=null;
                  tail=temp;
                  tail.next=head;
              break;
              
              case 3:
                  Node temp1 =head;
                  Node ptr1=temp1.next;
                  System.out.println("enter position: ");
                  int a=sc.nextInt();
                  for(int i=0; i<(a-1); i++)
                  {
                      temp1=temp1.next;
                      ptr1=ptr1.next;
                  }
                  temp1.next=ptr1.next;
                  ptr1.next=null;
              break;      
                  
          }
            System.out.println("do you want to add data");
            y=sc.nextInt();
        }while(y==1);
      }
  }
  
  public void traverse()
  {
      Node temp=head;
      if(head==null)
      {
         System.out.println("circular linklist does not exiest");
      }
      else
      {
          do
          {
              System.out.print(temp.data+" ");
              temp=temp.next;
          }while(temp!=head);
          
              
      }
      
  }
  
  
  
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main m=new Main();
		m.createcl();
		m.traverse();
		m.delete();
		m.traverse();
	}
}