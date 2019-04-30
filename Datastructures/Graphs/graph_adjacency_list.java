/**
 * @author Srishilesh P S
 *
 */
import java.util.Scanner;
import java.util.LinkedList;
public class graph_adjacency_list {
	int V;
	LinkedList<Integer> adjArr[];
	graph_adjacency_list(int V)		// Constructor
	{
		this.V=V;
		 adjArr=new LinkedList[V];		// Array for storing the Vertices
		 
		 for(int i=0;i<V;i++)			// Array for the Adjacency list for storing the edges
			 adjArr[i]=new LinkedList<>();
		
	}
	static void addEdge(graph_adjacency_list graph,int src,int dest)
	{
		graph.adjArr[src].add(dest);	// To add dest in src linkedlist
		graph.adjArr[dest].add(src);	// To add src in dest Linkedlist
		
	}
	static void printGraph(graph_adjacency_list graph)
	{
		for(int i=0;i<graph.V;i++)
		{
			System.out.println("Adjacency list of Vertex "+i);
			System.out.print("Head");
			for(Integer pCrawl: graph.adjArr[i])
			{
				System.out.print("-->"+pCrawl);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();		// Number of test cases
		int V=sc.nextInt();		// Number of Vertices
		int E=sc.nextInt();		// Number of Edges
		graph_adjacency_list graph =new graph_adjacency_list(V);
		for(int i=0;i<E;i++)
		addEdge(graph, sc.nextInt(), sc.nextInt()); 
        
        printGraph(graph);
	}
	
	

}
