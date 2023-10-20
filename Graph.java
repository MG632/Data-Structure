import java.util.Scanner;
import java.util.LinkedList;
public class Main
{
    private LinkedList<Integer> adjacency[];
    public Main(int v){
    adjacency=new LinkedList[v];
    
    for(int i=0; i<v; i++)
    {
        adjacency[i]=new LinkedList<Integer>();
    }
    }
    
    public void insertadge(int s,int d)
    {
        adjacency[s].add(d);
        adjacency[d].add(s);
    }
    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter No of vertices");
		int v=sc.nextInt();
		System.out.println("enter No of edges");
		int e=sc.nextInt();
		Main m=new Main(v);
		System.out.println("enter edge");
		for(int i=0; i<e;i++)
		{
		   int s=sc.nextInt(); 
		   int d=sc.nextInt(); 
		   m.insertadge(s, d);
		}
		
	}
}
