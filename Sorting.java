class Sorting
{
public static void main(String []args)
{
int arr[]={30,10,20};
System.out.println("Before Sorting:");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println("after Sorting");
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr.length-1-i;j++)
{
if(arr[j]>arr[j+1])
{
int temp=arr[j+1];
arr[j+1]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
}
}
