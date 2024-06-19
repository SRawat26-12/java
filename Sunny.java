import java.util.Scanner;
public class Sunny
{
static int flag=0;
static int square(int r)
{
int s=r+1;
for(int i=1;i<=s/2;i++)
{
if(i*i==s)
{
flag=1;
break;
}
}
if(flag==1)
System.out.println("Sunny number");
else
System.out.println("Not");
}
public static void main(String []args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
n=sc.nextInt();
square(n);
}
}


