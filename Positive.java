import java.util.Scanner;
class Positive
{
public static void main(String []args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
n=sc.nextInt();
if(n>0)
{
System.out.println("number is positive");
}
else if(n<0)
{
System.out.println("number is negative");
}
else
{
System.out.println("number is zero");
}
}
}