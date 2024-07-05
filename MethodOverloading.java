class MethodOverloading
{
public void add()
{
int a=10;
int b=20;
System.out.println(a+b);
}
public void add(int a,int b)
{

System.out.println(a+b);
}
public void add(String a,String b)
{
int c=Integer.parseInt(a)+Integer.parseInt(b);

System.out.println(c);
}
public static void main(String []args)
{
MethodOverloading ob=new MethodOverloading();
ob.add();
ob.add(10,20);
ob.add("1","1");
}
}



