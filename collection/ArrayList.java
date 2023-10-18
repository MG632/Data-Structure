import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList<Integer> c=new ArrayList<>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		//int a=c.get(2);
		//System.out.println(a);
		c.remove(2);
		//boolean b=c.contains(10);
		//System.out.println(b);
		c.set(1,90);
		
		c.clear();
		System.out.println(c);
		
		
		
	}
}
