public class Main {
public static void main(String args[])
{
	int n[]={24,1346,123160000,1440000,1345,34,-1111,-1,100,12};
	if(n.length%2!=0)
	{
	int min=n[0];
	int max=n[0];
	for(int i=1;i<n.length-1;i=i+2)
	{
		if(n[i]>n[i+1])
			{
			  if(n[i+1]<min)
				  min=n[i+1];
			  if(n[i]>max)
				  max=n[i];
			}
		else
		{
			 if(n[i]<min)
				  min=n[i];
			  if(n[i+1]>max)
				  max=n[i+1];
		}
	}
	System.out.println("Maximum="+max);
	System.out.println("Minimum="+min);
   }
	else
	{  
		int min,max;
		if(n[0]>n[1])
			{
			  min=n[1];
			  max=n[0];
			}
		else
		    {
			  min=n[0];
			  max=n[1];
			}
		for(int i=2;i<n.length-1;i=i+2)
		{
			if(n[i]>n[i+1])
			{
			  if(n[i+1]<min)
				  min=n[i+1];
			  if(n[i]>max)
				  max=n[i];
			}
		else
		{
			 if(n[i]<min)
				  min=n[i];
			  if(n[i+1]>max)
				  max=n[i+1];
		}
	}
	System.out.println("Maximum="+max);
	System.out.println("Minimum="+min);
		}
	}
}
