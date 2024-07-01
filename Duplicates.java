import java.util.Scanner;
class Duplicates
{
public static void main(String []args)
{
int arr[]=new int[6];
int n=arr.length;
System.out.println("Enter array elements");
Scanner sc=new Scanner(System.in);
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Duplicates");
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
System.out.print(arr[i]+" ");
}
}
}
}
}
