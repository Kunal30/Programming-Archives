import java.io.*;
import java.util.*;
public class Main {
	static int number_no_nodes;
public static void main(String args[])throws IOException
{
	  Graph G=new Graph();
	  System.out.println("Enter the number of nodes in the graph");
      Scanner scanner = new Scanner(System.in);
       number_no_nodes = scanner.nextInt();
      int adjacency_matrix[][] = new int[number_no_nodes + 1][number_no_nodes + 1];
      System.out.println("Enter the adjacency matrix");
        for (int i = 1; i <= number_no_nodes; i++)
            for (int j = 1; j <= number_no_nodes; j++)
                adjacency_matrix[i][j] = scanner.nextInt();
      G.createGraph(adjacency_matrix,number_no_nodes);
      System.out.println("Give the source node for BFS");
      int source=Integer.parseInt(scanner.next());
      G.BFS(source);
}
}
