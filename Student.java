import java.util.Scanner;
class Student
{
public static void main(String []args)
{
String name;
char section;
String address;
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
name=sc.nextLine();
System.out.println("enter section");
section=sc.next().charAt(0);
System.out.println("enter address");
sc.nextLine();
address=sc.next();
System.out.println("Name:"+name);
System.out.println("Section:"+section);
System.out.println("Address:"+address);
}
}

