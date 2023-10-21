import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n,i,j,loc=0;
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
		for(i=0; i<n-1; i++)
		{
		    for(j=i+1;j<n;j++)
		    {
		        if(arr[j]<arr[loc])
		        {
		        loc=j;
		        }
		         temp=arr[i];
		         arr[i]=arr[loc];
		         arr[loc]=temp;
		    }
		    
		   
		}
		for(i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}
