import java.util.Map;
import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Map<Integer, String> c=new HashMap<>();
		c.put(50,"Abc");
		c.put(20,"def");
		c.put(90,"ghi");
		c.put(40,"jkl");
		c.putIfAbsent(20,"mns");
		c.remove(40);
		System.out.println(c);
		System.out.println(c.isEmpty());
		
		
		System.out.println(c);

                for(Integer d: c.keySet())
                {
                   System.out.print(d+" ");
                }

                for(String e: c.values())
                {
                   System.out.print(e+" ");
                }
	}
}
