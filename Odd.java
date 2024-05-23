import java.util.Scanner;
class Odd
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("input number of terms is:");
int n,sum=0,i;
{
n=sc.nextInt();
System.out.println("the odd numbers are:");
for(i=1;i<=n;i++)
{
System.out.println(2*i-1);
sum=sum+2*i-1;
}
System.out.println(sum);
}
}
} 
