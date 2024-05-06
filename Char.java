import java.util.Scanner;

class Char
{
public static void main(String []args)
{
String s;
Scanner sc=new Scanner(System.in);
System.out.println("enter your full name");
s=sc.nextLine();
char c=s.charAt(0);
char d=s.charAt(10);
System.out.println(c);
System.out.println(d);
}
}




