import java.util.Scanner;
class Select
{
public static void Select(int arr[],int size)
{
int temp,c;
for(int i=0;i<size;i++)
{
c=i;
for(int j=i+1;j<size;j++)
{
if(arr[c]>arr[j])
{
c=j;
}
}
if(arr[c]!=arr[i])
{
temp=arr[i];
arr[i]=arr[c];
arr[c]=temp;
}
}
System.out.println("after selection sort");
for(int i=0;i<size;i++)
{
System.out.println(arr[i]+" ");
}
}


public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("enter array elements");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
Select(arr,size);


