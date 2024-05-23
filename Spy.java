import java.util.Scanner;
class Spy
{
public static void main(String []args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
int sum=0,product=1;
while(n!=0)
{
int rem=n%10;
sum=sum+rem;
product=product*rem;
n=n/10;
}
if(product==sum)
{
System.out.println("spy Number");
}
else
{
System.out.println("not spy number");
}
}
}