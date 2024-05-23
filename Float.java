import java.util.Scanner;
class Float
{
public static void main(String []args)
{
float a,b;
Scanner sc=new Scanner(System.in);
System.out.println("input floating-point number");
a=sc.nextFloat();
System.out.println("input another floating-point number");
b=sc.nextFloat();
if(a==b)
{
System.out.println("they are same");
}
else
{
System.out.println("they are different");
}
}
}
