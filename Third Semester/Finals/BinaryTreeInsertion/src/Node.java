public class Node {
Comparable data;
Node left=null,right=null;
int family_mem=0;
public void addNode(Node nextNode)
{      	
	    if(left==null)
			{left=nextNode;
			 family_mem++;
			}
		else
		if(right==null && left!=null)
			{right=nextNode;
			 family_mem++;
			}
		else if(left!=null && right!=null)
		{       
			    if(family_mem!=2)
				left.addNode(nextNode);
			    else
			    	if(family_mem==2)
			    		right.addNode(nextNode);
		}
				}
public void printNodes()
{
  if(left!=null)
	  left.printNodes();
  System.out.println(data+" ");
  if(right!=null)
	  right.printNodes();
}
}
