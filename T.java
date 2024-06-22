import java.util.Scanner;
public class T
{
public static void printTable(int n)
{
for(int i=1;i<=10;i++)
{
System.out.printf("\n%d*%d=%d",n,i,n*i);
}
}
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int a=sc.nextInt();
printTable(a);
}
}
