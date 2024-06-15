import java.util.Scanner;
class Avgeven
{
public static void main(String []args)
{
int arr[]=new int[5];
int i,sum=0;
Scanner sc=new Scanner(System.in);
for(i=0;i<arr.length;i++)
{
System.out.println("Enter Element Index of "+i+":");
arr[i]=sc.nextInt();
if(arr[i]%2==0)
{
sum=sum+arr[i];
}
}
System.out.println("sum :"+sum);
System.out.println("sum :"+sum/arr.length);
}
}