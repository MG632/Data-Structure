import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n,beg=0, mid=0,c=0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		n=sc.nextInt();
		int end=n-1;
		int[] arr=new int[n];
		System.out.println("Enter data");
		for(int i=0; i<n; i++)
		{
		    arr[i]=sc.nextInt();
		}
		
		System.out.println("enter item that search");
	    int item=sc.nextInt();
	    
	   
	    while(beg<=end)
	    {
	         mid=(beg+end)/2;
	    if(arr[mid]==item)
	    {
	        c++;
	        break;
	    }
	    else if(item<arr[mid])
	    {
	        end=mid-1;
	    }
	    else if(item>arr[mid])
	    {
	        beg=mid+1;
	    }
	    }
	    
	    if(c>0)
	    {
	        System.out.println("Item exist at"+mid);
	    }
	    else
	    {
	        System.out.println("Item does not exist");
	    }
	}
}
