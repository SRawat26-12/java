import java.util.Scanner;
class Greater
{
public static void main(String []args)
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter two number");
a=sc.nextInt();
b=sc.nextInt();
if(a>b)
{
System.out.println("a is greater"+a);
}
else 
{
System.out.println("b is greater"+b);
}
}
}