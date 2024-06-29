import java.util.Scanner;
class React
{
int l;
int b;
public void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter length:");
l=sc.nextInt();
System.out.println("Enter bredth:");
b=sc.nextInt();
}
public void showData()
{
System.out.println("length is:"+l);
System.out.println("breadth is:"+b);
}
public void getArea()
{
System.out.println("Area of Reacatagle:"+(l*b));
}
public void getPeri()
{
System.out.println("perimeter of Reactangle:"+2*(l+b));
}
public static void main(String []args)
{
React r=new React();
r.getData();
r.showData();
r.getArea();
r.getPeri();
}
}

