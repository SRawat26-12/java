import java.util.Scanner;
class Calculator
{
public static void main(String []args)
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter two number:");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("enter 1 for addition");
System.out.println("enter 2 for multiplication");
System.out.println("enter 3 for divide");
System.out.println("enter 4 for remainder");
System.out.println("enter your choice:");
int n;
n=sc.nextInt();
switch(n)
{
case 1:
int c=a+b;
System.out.println("addition is :"+c);
break;
case 2:
int d=a*b;
System.out.println("multiplication is :"+d);
break;
case 3:
double e=a/b;
System.out.println("divide is :"+e);
break;
case 4:
int f=a%b;
System.out.println("remainder is :"+f);
break;
}
}
}






