import java.util.Scanner;
class Emp
{
String name;
String job;
float bsl;
int depno;

public void acceptData()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
name=sc.nextLine();
System.out.println("enter job");
job=sc.nextLine();
System.out.println("enter basic salary");
bsl=sc.nextFloat();
System.out.println("enter department no.");
depno=sc.nextInt();
}
public void showData()
{
System.out.println(" name is:"+name);
System.out.println("job is:"+job);
System.out.println("basic salary is:"+bsl);
System.out.println("department no. is:"+depno);
}
public double getHra()
{
return bsl*0.2;
}
public double getDa()
{
return bsl*0.1;
}
public double getTa()
{
return bsl*0.1;
}
public double totalIncentive()
{
return bsl*0.2+bsl*0.1+bsl*0.1;
}
public double grossSalary()
{
return bsl+bsl*0.2+bsl*0.1+bsl*0.1;
}
public static void main(String []args)
{
Emp e=new Emp();
e.acceptData();
e.showData();
System.out.println("Hra is:"+e.getHra());
System.out.println("Da is:"+e.getDa());
System.out.println("Ta is:"+e.getTa());
System.out.println("TotalIncentive is:"+e.totalIncentive());
System.out.println("Gross Salary is:"+e.grossSalary());
}
}






