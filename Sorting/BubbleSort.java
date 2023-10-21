import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n ;
		int temp=0;
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
		
		for(int i=0;i<n-1;i++)
		{
		    for(int k=0; k<n-i-1;k++)
		    {
		        if(arr[k]>arr[k+1])
		        {
		            temp=arr[k];
		            arr[k]=arr[k+1];
		            arr[k+1]=temp;
		        }
		    }
		}
		
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}
