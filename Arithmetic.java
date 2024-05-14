import java.util.Scanner;
class Arithmetic
{
public static void main(String []args)
{
int a;
int b;
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
a=sc.nextInt();
System.out.println("enter second number");
b=sc.nextInt();
int c=a+b;
int d=a-b;
int e=a*b;
int f=a/b;
int g=a%b;
System.out.println(a+"+"+b+"="+c);
System.out.println(a+"-"+b+"="+d);
System.out.println(a+"*"+b+"="+e);
System.out.println(a+"/"+b+"="+f);
System.out.println(a+"%"+b+"="+g);
}
}