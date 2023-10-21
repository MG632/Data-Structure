import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n,i,j;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		n=sc.nextInt();
		System.out.println("Enter elements");
		int[] arr=new int[n];
		for(i=0; i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(i=1; i<n; i++)
		{
		   temp=arr[i];
		   j=i-1;
		   
		   while( j>=0 && temp<arr[j] )
		   {
		       arr[j+1]=arr[j];
		       j--;
		   }
		    arr[j+1]=temp;
		   
		}
		for(i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}
