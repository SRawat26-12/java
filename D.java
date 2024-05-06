import java.util.Scanner;
class D
{
public static void main(String []args)
{
double r,ar,cr;
Scanner sc=new Scanner(System.in);
System.out.println("enter radius:");
r=sc.nextDouble();
ar=3.14*r*r;
cr=2*3.14*r;
System.out.println(ar+"  "+cr);
}
}