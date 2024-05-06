import java.util.Scanner;
class Employee
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System .out.println("enter employee name:");
String name=sc.nextLine();
System.out.println("enter salary");
float f=sc.nextFloat();
System.out.println("enter job profile:");
sc.nextLine();
String profile=sc.nextLine();
System.out.println("enter Empno:");
int empNo=sc.nextInt();
System.out.println("enter depno:");
int depNo=sc.nextInt();
System.out.println("enter grade:");
char grade=sc.next().charAt(0);
System.out.println("employee name:"+name);
System.out.println("salary:"+f);

System.out.println("job profile:"+profile);

System.out.println("emp no:"+empNo);

System.out.println("depno"+depNo);

System.out.println("Grade:"+grade);
}
}

