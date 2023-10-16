import java.util.Scanner;
public class Main
{
       static class Stack
    {
        int data;
        int n=10;
        int top=-1;
         Scanner sc=new Scanner(System.in);
         int[] arr=new int[n];
        public void push()
        {
            System.out.println("Enter data");
            data=sc.nextInt();
            
            if(top==(n-1))
            {
             System.out.println("Stack overflow");   
            }
            else
            {
               top=top+1;
               arr[top]=data;
               System.out.println("item inserted");
               
            }
        }
        
        public void pop()
        {
            if(top==-1)
            {
                System.out.println("Stack underflow");
            }
            else
            {
                top=top-1;
                System.out.println("item pop");
            }
        }
        
        public void display()
        {
            for(int i=top; i>=0 ;i--)
            {
                System.out.print(arr[i]+" ");
            }
        }
        
    }
 
    	public static void main(String[] args)
    	{
    	    Scanner sc=new Scanner(System.in);
    	    Stack m=new Stack();
    	    int a;
    	    do
    	    {
        		System.out.println("1.  push data  2. pop data  3. display data");
        		int x=sc.nextInt();
        		
        		switch(x)
        		{
        		    case 1:
        		        m.push();
        		    break;
        		    
        		    case 2:
        		        m.pop();
        		    break;
        		    
        		    case 3:
        		        m.display();
        		    break;
        		}
        		System.out.println("Retern to menu");
        		a=sc.nextInt();
    	    }while(a==0);
	    }
    
}
