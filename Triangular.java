import java.util.Scanner;
class Triangular
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
System.out.println("triangular numbers are");
int j=3;
for(int i=3;i<=n;i++)
{
System.out.println(j);
j=j+i;
}
}
}
