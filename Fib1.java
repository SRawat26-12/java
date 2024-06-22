class Fib1
{
public static int fib(int n)
{
int a=0,b=1,c;
for(int i=1;i<=n;i++)
{
System.out.print(a+" ");
c=a+b;
a=b;
b=c;
}
return a;
}
public static void main(String []args)
{
int s=fib(8);
}
}