import java.util.Set;
import java.util.TreeSet;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Set<Integer> c=new TreeSet<>();
		c.add(50);
		c.add(20);
		c.add(90);
		c.add(40);
		c.remove(20);
		System.out.println(c);
		int b=c.size();
		System.out.println(c.contains(10));
		System.out.println(b);
		c.clear();
		System.out.println(c);
	}
}
