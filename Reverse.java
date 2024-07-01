import java.util.Scanner;
class Reverse
{
public static void main(String []args)
{
int arr[]=new int[]{1,2,3,4,5};
int n=arr.length;
System.out.println("array reverse");
for(int i=n-1;i>=0;i--)
{
System.out.print(arr[i]+" ");
}
}
}