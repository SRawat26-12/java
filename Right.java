class Right
{
public static void main(String []args)
{
int arr[]=new int[]{1,2,3,4,5};
int n=arr.length;
for(int i=0;i<3;i++)
{
int j,last=arr[n-1];
for(j=n-1;j>0;j--)
{
arr[j]=arr[j-1];
}
arr[0]=last;
}
System.out.println("rotate array:");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
}
}
