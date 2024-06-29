class Merge
{
public static void merge(int arr[],int low,int mid,int high)
{
int i,j,k;
int b[]=new int[7];
i=low;
j=mid+1;
k=low;
while(i<=mid&&j<=high)
{
if(arr[i]<arr[j])
{
b[k]=arr[i];
i++;
}else
{
b[k]=arr[j];
j++;
}
k++;
}
while(i<=mid)
{
b[k]=arr[i];
k++;
i++;
}
while(j<=high)
{
b[k]=arr[j];
k++;
j++;
}
for(i=low;i<=high;i++)
{
arr[i]=b[i];
}
}
public static void msort(int arr[],int low,int high)
{
int mid;
if(low<high)
{
mid=(low+high)/2;
msort(arr,low,mid);
msort(arr,mid+1,high);
merge(arr,low,mid,high);
}
}
public static void printArr(int arr[],int n)
{
int i;
for(i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
}
public static void main(String []args)
{
int arr[]=new int[]{3,5,2,13,12,10,6};
int n=arr.length;
printArr(arr,n);
msort(arr,0,n-1);
System.out.println("after merge sort");
printArr(arr,n);
}
}
