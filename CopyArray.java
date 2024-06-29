import java.util.Scanner;
public class CopyArray
{
public static void main(String []args)
{
int arr[]=new int[5];
int brr[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter array elements");
for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("copy array elements");
for(int i=0;i<5;i++)
{
brr[i]=arr[i];
}
System.out.println("display new array elements");
for(int i=0;i<5;i++)
{
System.out.print(brr[i]+" ");
}
}
}