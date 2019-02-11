public class Root_Down {
public static void main(String args[])
{
	int A[]={12,43,123,111,1,23,45,2};
	buildHeapRootDown(A);
	for(int i=0;i<A.length;i++)
		System.out.println(A[i]);
}
public static void buildHeapRootDown(int heap[]){
	int N = heap.length-1;
	for(int i=1;i<=N;i++){
		heapifyRD(heap,i);
	}
}
public static void heapifyRD(int []heap,int i){
	if(i==0){	
		return;
	}
	int a=heap[i];
	int b=heap[i/2];	
	if(a>b){
		heap[i/2]=a;
		heap[i]=b;
		heapifyRD(heap,i/2);
	}
	}
}
