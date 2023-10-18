import java.util.PriorityQueue;
import java.util.Queue;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Queue<Integer> c=new PriorityQueue<>();
		c.offer(10);
		c.offer(20);
		c.offer(30);
		c.offer(40);
		c.poll();
		int p=c.peek();
		System.out.println(p);
	
		System.out.println(c);
	}
}
