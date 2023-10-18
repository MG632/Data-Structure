import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		List<Integer> c=new ArrayList<>();
		c.add(50);
		c.add(20);
		c.add(90);
		c.add(40);
		ListIterator<Integer> d=c.listIterator();
		while(d.hasNext())
		{
		    System.out.println(d.next());
		}
		while(d.hasPrevious())
		{
		    System.out.println(d.previous());
		}
	}
}
