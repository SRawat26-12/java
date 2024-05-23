import java.util.Scanner;
class Special
{
public static void main(String []args)
{
int n,sum=0,product=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
int first=n/10;
int last=n%10;
sum=first+last;
product=first*last;
if((product+sum)==n)
{
System.out.println("special number");
}
else
{
System.out.println("not special");
}
}
}
