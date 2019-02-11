import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
public class Graph {
 Vertex node[];
	public void createGraph(int [][]adjacency_matrix,int number_of_nodes)
	{
		node=new Vertex[number_of_nodes+1];
		for(int i=1;i<=number_of_nodes;i++)//initialized the nodes
			{
			node[i]=new Vertex();
			node[i].id=i;
			}
		for(int i=1;i<=number_of_nodes;i++)
		{
			for(int j=1;j<=number_of_nodes;j++)
			{
				if(adjacency_matrix[i][j]==1)
				{   
					node[i].Link[j]=node[j];
				}
			}
		}
	}
	public void BFS(int source)
	{
	  node[source].color="gray";
	  node[source].d=0;
	  node[source].parent=null;
		Queue<Vertex> queue=new LinkedList<Vertex>();
		queue.add(node[source]);
		while(!queue.isEmpty())
		{
			Vertex u=queue.remove();
			System.out.print(u.id + "\t");
		      	for(int j=1;j<node.length;j++)
		      	{
		      	  if(u.Link[j]!=null)
		      	  { 	
		      		if(u.Link[j].color.equals("white"))
		      		{
		      			u.Link[j].color="gray";
		      			u.Link[j].d=u.d+1;
		      		    u.Link[j].parent=u;
		      			queue.add(u.Link[j]);
		      		}
		      	  }	
		      	}
		    u.color="black";
		}
	}
}