import java.util.Scanner;
class Product
{
public static void main(String []args)
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
a=sc.nextInt();
System.out.println("enter second number");
b=sc.nextInt();
int c=a*b;
System.out.println(a+"*"+b+"="+c);
}
}
