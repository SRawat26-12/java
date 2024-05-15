import java.util.Scanner;
class Nested
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if(c>='a')
{
if(c<='z')
{
System.out.println("lowercase");
}
}
else if(c>='A')
{
if(c<='Z')
{
System.out.println("uppercase");
}
}
}
}
