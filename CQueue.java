import java.util.Scanner;
public class Main
{
    int f=-1;
        int r=-1;
        int n=5;
        int a[]=new int[n];
    public void enQueue()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data");
        int data=sc.nextInt();
        if(f==(r+1)%n)
        {
            System.out.println("enQueue overflow");
        }
        else if(f==-1 && r==-1)
        {
            f=0;
            r=0;
           a[r]=data;
            
        }
        else{
            r=(r+1)%n;
            a[r]=data;
        }
        
    }
    
    public void deQueue()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("Queue underflow");
        }
        else if(f==r)
        {
            System.out.println("Queue underflow");
        }
        else
        {
           f=(f+1)%n;
           System.out.println("data deleted");
        }
        
    }
    
    public void Display()
    {
        int i;
        for(i=f; i!=r;i=(i+1)%n)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print(a[i]+" ");
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main m=new Main();
		Scanner sc =new Scanner(System.in);
		int z;
		do
		{
    		System.out.println("1. enQueue data \n2. deQueue data  \n3. Display data");
    		int x=sc.nextInt();
    		switch(x){
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
    		System.out.println("Main menu press 1");
    		z=sc.nextInt();
		}while(z==1);
	}
}
