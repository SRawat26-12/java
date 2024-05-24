import java.util.Scanner;
class Arm
{
public static void main(String []args)
{
int n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
int c=n;
while(n!=0)
{
int rem=n%10;
sum=sum+rem*rem*rem;
n=n/10;
}
if(c==sum)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("not Armstrong");
}
}
}
