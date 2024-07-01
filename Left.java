class Left
{
public static void main(String []args)
{
int arr[]=new int[]{1,2,3,4,5};
int n=arr.length;
for(int i=0;i<3;i++)
{
int j,first=arr[0];
for(j=0;j<n-1;j++)
{
arr[j]=arr[j+1];
}
arr[j]=first;
}

System.out.println("left rotate");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
}
}