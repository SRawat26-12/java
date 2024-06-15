import java.util.Scanner;
class DecimalToBinary
{
public static void main(String []args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter any number");
n=sc.nextInt();
int arr[]=new int[32];
int i=0;
while(n>0)
{
int r=n%2;
arr[i]=r;
i++;
n=n/2;
}
System.out.println("Binary representation:");
for( i=i-1;i>=0;i--)
{
System.out.println(arr[i]+" ");
}
}
}
