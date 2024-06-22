import java.util.Scanner;
class Function3
{
public static int add()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter Second  number");
int b=sc.nextInt();
return a+b;
}
public static void main(String []args)
{
int s=add();
System.out.println(s);
}
}