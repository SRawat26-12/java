class A3
{
public A3()
{
System.out.println("Class A constructor");
}
}
class B3 extends A3
{
public B3( int a, int b)
{
System.out.println("Class B constructor");
}
public static void main(String args[])
{
B3 obj=new B3(10,20);
}
}
