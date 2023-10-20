import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i;
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter DATA");
		for(i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter search item");
		int a=sc.nextInt();
		int c=0;
		for( i=0;i<n;i++)
		{
		    if(arr[i]==a)
		    {
		        c++;
		        break;
		    }
		}
		
		if(c>0)
		{
		    System.out.println("Item exist at "+i);
		}
		else{
		    System.out.println("Item does not exist");
		}
	}
}
