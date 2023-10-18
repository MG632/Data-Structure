import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		LinkedList<Integer> c=new LinkedList<>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.remove(2);
		int p=c.peek();
		c.set(1,100);
		boolean q=c.contains(100);
		System.out.println(p);
		System.out.println(q);
		System.out.println(c);
	}
}
