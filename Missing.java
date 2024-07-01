class Missing
{
public static void main(String []args)
{
int arr[]=new int[]{2,5,3,1,0};
int n=arr.length;
int sum=n*(n+1)/2;
int s=0;
for(int i=0;i<n;i++)
{
s=s+arr[i];
}
System.out.println(sum-s);
}
}