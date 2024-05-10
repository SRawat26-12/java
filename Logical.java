class Logical
{
public static void main(String []args)
{
int a,b,c,d;
a=10;
b=20;
c=30;
d=40;
boolean r=a<b&&c<d;
boolean s=a<b||c>d;
boolean t=!(a>b||c>d);

System.out.println(r);
System.out.println(s);
System.out.println(t);

}
}