public class Main {
    static int N;
public static void main(String args[])
{    
    int A[]={1,2,3,5,62};
    heapify(A);
    findParent_LeftChild_RightChild_Of_Each(A);
}
public static void heapify(int arr[])
{
    N = arr.length-1;
    for (int i = N/2; i >= 0; i--)
        maxheap(arr, i);        
}        
public static void maxheap(int arr[], int i)
{ 
    int left = 2*i ;
    int right = 2*i + 1;
    int max = i;
    if (left <= N && arr[left] > arr[i])
        max = left;
    if (right <= N && arr[right] > arr[max])        
        max = right;

    if (max != i)
    {
        swap(arr, i, max);
        maxheap(arr, max);
    }
}
public static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
public static void findParent_LeftChild_RightChild_Of_Each(int []A)
{
    for(int i=0;i<=N;i++)
    {  
        System.out.println("Node Selected="+A[i]);
        if(i%2==0&&(i-1)/2>=0&&i!=0)
        System.out.println("Its Parent="+A[(i-1)/2]);
        else if(i%2!=0)
            System.out.println("Its Parent="+A[i/2]);
        else 
            System.out.println("No Parent Exists");
        if(2*i+1<=N)
        System.out.println("Its Left Child="+A[(2*i)+1]);
        else
            System.out.println("No Left Child Exists");
        if(2*i+2<=N)
            System.out.println("Its Right Child="+A[(2*i)+2]);
            else
                System.out.println("No Right Child Exists");
        System.out.println();
    }
}
}