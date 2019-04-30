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
		int V=5;
		graph_adjacency_list graph =new graph_adjacency_list(V);
		addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
        printGraph(graph);
	}
	
	

}
