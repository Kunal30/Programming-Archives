public class Main
{ 
	static int M; 
 public static void main(String args[])
 {
	 int Arr[]={7,8,9,10,11,12,13,14,15,16,17,18,19,20,3,4,5,6};
	 System.out.println("Maximum Element="+rotated_binary_search(Arr,Arr.length));
	 if(M!=Arr.length-1)
	 System.out.println("Minimum Element="+Arr[M+1]);
	 else
		 System.out.println("Minimum Element="+Arr[0]);
 }
 public static int rotated_binary_search(int A[], int N)
 {	  
	 int L = 0;
	  int R = N - 1;
	  while (L <= R)
	  {  
		 M = L + ((R - L) / 2);  
	    if(M==A.length-1&&A[M]>A[0])
	    return A[M];
	    else
	    if(A[M] > A[M+1]) 
	    	return A[M];
	    else
	    if(A[L]>A[M])
	    	R=M-1;
	    else 
	    	L=M+1;
	  }
	  return -1;
	}
}