import java.util.Scanner;

public class Main
{
    int f=-1;
    int r=-1;
    int n, data;
    int a=10;
    Scanner sc= new Scanner(System.in);
     int arr[]=new int[a];
    public void enqueue()
    {
            int i=-1;
            System.out.println("Enter data");
            data=sc.nextInt();
            if(r==(a-1))
            {
                System.out.println("queue overfloe");   
            }
            else
            {
                if(f==-1 && r==-1)
                {
                    f=f+1;
                    r=r+1;
                    arr[r]=data;
                }
                else
                {
                    r=r+1;
                    arr[r]=data;
                }
            }
        
           
    }
    
    public void dqueue()
    {
      
            if(f==-1 && r==-1)
            {
                System.out.println("queue Underflow");
            }
            else
            {
                f=f+1;   
            }
    }
    
    public void display()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("queue does not exist");
        }
        else
        {
            for(int i=f; i<=r; i++)   
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n;
		Main m=new Main();
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("1. EnQueue data \n2. DeQueue data \n3. Display data");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		    case 1:
		        m.enqueue();
		    break;
		    
		    case 2:
		        m.dqueue();
		    break;
		    
		    case 3:
		        m.display();
		    break;
		}
		System.out.println("Main menu  press: 1");
          n=sc.nextInt();
		}while(n==1);
	}
}
