import java.util.Scanner;
class Area1
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Press 1 for triangle");
System.out.println("Press 2 for Equilateral");
System.out.println("Press 3 for Square");
System.out.println("Press 4 for Rectangle");
System.out.println("Press 5 for Circle");
System.out.println("enter your choice");
int n=sc.nextInt();
switch(n)
{
case 1:
int a,b;
System.out.println("enter two number");
a=sc.nextInt();
b=sc.nextInt();
float c=0.5f*a*b;
System.out.println("Area of right triangle:"+c);
break;
case 2:
int d;
d=sc.nextInt();
double area=(1.732/4)*d*d;
System.out.println("Areaof equilateral triangle:"+area);
break;
case 3:
int e=sc.nextInt();
System.out.println("area of Square:"+e*e);
break;
case 4:
int f=sc.nextInt();
int g=sc.nextInt();
System.out.println("area of reactangle"+f*g);
break;
case 5:
int r=sc.nextInt();
double s=3.14*r*r;
System.out.println("Area of circle"+s);
break;
default:
System.out.println("invalid choice");
}
}
}
