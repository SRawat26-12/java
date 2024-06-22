import java.util.Scanner;
class Function4
{
public static int add(int a,int b)
{
return a+b;
}
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter Second  number");
int b=sc.nextInt();

int s=add(a,b);
System.out.println(s);
}
}