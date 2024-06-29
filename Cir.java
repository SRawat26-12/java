import java.util.Scanner;
class Cir
{
float r;


public void  getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius:");
r=sc.nextFloat();
}
public  void showData()
{
System.out.println("radius is:"+r);
}
public void getArea()
{
System.out.println("Area of circle:"+3.14*r*r);
}
public void getCirc()
{
System.out.println("Circumference of circle:"+2*3.14*r);
}
public static void main(String []args)
{
Cir c=new Cir();
c.getData();
c.showData();
c.getArea();
c.getCirc();
}
}