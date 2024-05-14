import java.util.Scanner;

class CheckNumber
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any number");
int n=sc.nextInt();
if(n>0)
{
System.out.println("number is positive");

}
if(n<0)
{
System.out.println("number is negative");
}
}
}
