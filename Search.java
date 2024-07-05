import java.util.Scanner;
class Sea
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String s="this is a test string";
String r;
System.out.println("enter the string to be search");
r=sc.nextLine();
boolean t=s.contains(r);
if(t)
{
System.out.println("the string is exist");
}
else
{
System.out.println("the string is not exist");
}
}
}
