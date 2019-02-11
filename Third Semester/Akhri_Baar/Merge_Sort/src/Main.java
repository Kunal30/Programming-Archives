public class Main {
static int tempMergArr[]=new int[100];
public static void main(String args[])
{
	int arr[]={134,245,13414,45,232,11,35,1,256};
    Merge_Sort(arr,0,arr.length-1);
	for(int i=0;i<arr.length;i++)
		System.out.print(" "+arr[i]+" ");
}
public static void Merge_Sort(int []a,int p,int r)
{
	int q;
	if(p<r)
	{
		q=(p+r)/2;
		Merge_Sort(a,p,q);
		Merge_Sort(a,q+1,r);
		Merge(a,p,q,r);
	}
}
public static void Merge(int []a,int p,int q,int r)
{   
	for (int i = p; i <= r; i++) {
        tempMergArr[i] = a[i];
    }
    int i = p;
    int j = q + 1;
    int k = p;
    while (i <= q && j <= r) {
        if (tempMergArr[i] <= tempMergArr[j]) {
            a[k] = tempMergArr[i];
            i++;
        } else {
            a[k] = tempMergArr[j];
            j++;
        }
        k++;
    }
    while (i <= q) {
        a[k] = tempMergArr[i];
        k++;
        i++;
    }
}
public static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
}
