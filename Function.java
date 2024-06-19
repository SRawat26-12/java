import java.util.Scanner;
class Function
{
public  void add()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
int n1=sc.nextInt();
System.out.println("Enter second number");
int n2=sc.nextInt();
System.out.println("Addition is:"+(n1+n2));
}
public static void main(String []args)
{
Function f=new Function();
f.add();
}
}