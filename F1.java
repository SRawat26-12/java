import java.util.Scanner;
public class F1
{
public void even()
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter number");
n=sc.nextInt();
if(n%2==0)
System.out.println("even");
else
System.out.println("odd");
}
public static void main(String []args)
{
F1 f=new F1();
f.even();
}
}