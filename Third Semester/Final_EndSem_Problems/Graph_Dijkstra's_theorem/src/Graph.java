import java.io.*;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Graph {
	int time=0;
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
			int z=1;
			for(int j=1;j<=number_of_nodes;j++)
			{
				if(adjacency_matrix[i][j]==1)
				{   
					node[i].Link[j]=node[j];
					z++;
				}
			}
		}
	}
	public void assignWeights()
	{
		Scanner s1=new Scanner(System.in);
		for(int i=1;i<node.length;i++)
		{
			for(int j=1;j<node.length;j++)
			{
				if(node[i].Link[j]!=null)
				{
					System.out.println("For going from Node "+i+" to Node "+j);
					node[i].Link[j].weight=Integer.parseInt(s1.next());
				}
			}
		}
	}
	
	public void Dijkstra(int source)
	{
		node[source].d=0;//Initialize_Single_Source(source);
		Graph S=new Graph();
		Q=G.V;
		while(!Q.isEmpty())
		{
			Vertex u=Extract_Min(Q);
			S=S U{u};
			for(int i=1;i<node.length;i++)
			{
				if(u.Link[i]!=null)
				{
					//Equivalent to Relax(u,u.Link[i])
					if(node[i].d>u.d+u.Link[i].weight)
					{
						node[i].d=u.d+u.Link[i].weight;
						node[i].parent=u;
					}
				}
			}
		}	
	}
	public void DFS()
	{
		for(int i=1;i<node.length;i++)
		{
			if(node[i].color.equals("white"))
				DFS_Visit(node[i]);
		}
	}
	public void DFS_Visit(Vertex u)
	{
		time=time+1;
		u.d=time;
		u.color="gray";
		for(int i=1;i<node.length;i++)
		{
			if(u.Link[i]!=null)
			{
				if(u.Link[i].color.equals("white"))
				{
					u.Link[i].parent=u;
					DFS_Visit(u.Link[i]);
				}
			}
		}
		u.color="black";
		System.out.print(u.id + "\t");
		time=time+1;
		u.f=time;
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