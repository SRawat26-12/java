import java.util.Scanner;
class Array2
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<arr.length;i++)
{
System.out.println("Enter element of Index of "+i+":");
arr[i]=sc.nextInt();
}
System.out.println("Elements of the array:");
for(int i=0;i<arr.length;i++)
{
System.out.println(i+" ");
}
}
}
