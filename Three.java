import java.util.Scanner;
class Three
{
public static void main(String []args)
{
int a,b,c;
System.out.println("enter three number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b)
{
if(a>c)
{
System.out.println("a is greater");
}
else
{
System.out.println("c is greater");
}
}
else
{
if(b>c)
{
System.out.println("b is greater");
}
else
{
System.out.println("c is greater");
}
}
}
}