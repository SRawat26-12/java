import java.util.Scanner;
class Duck
{
public static void main(String []args)
{
int n ,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
int c=n;
while(n!=0)
{

if(n%10==0)
{
flag=1;
break;
}
n=n/10;
}
if(c>0&&flag==1)
{
System.out.println("Duck number");
}
else
{
System.out.println("not duck number");
}
}
}