import java.util.Scanner;
class Table
{
public static void main(String []args)
{
int n,i=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
n=sc.nextInt();
do
{
System.out.println(i*n);
i++;
}
while(i<=10);
}
}