import java.util.List;
import java.util.Stack;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Stack<Integer> c=new Stack<>();
		c.push(10);
		c.push(20);
		c.push(30);
		c.push(40);
		c.pop();
		int a=c.peek();
		System.out.println(a);
		
		int b=c.search(10);
		System.out.println(b);
		System.out.println(c);
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5;i++)
		{
		System.out.println("enter data");
		int v=sc.nextInt();
		c.push(v);
		}
		System.out.println(c);
		
		
	}
}
