import java.util.Set;
import java.util.LinkedHashSet;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Set<Integer> c=new LinkedHashSet<>();
		c.add(10);
		c.add(20);
		c.add(30);
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
