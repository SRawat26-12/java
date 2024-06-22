public class Fib
{
public static void main(String []args)
{
int a=0,b=1,c,n=5;
for(int i=1;i<=n;i++)
{
System.out.print(a+" ");
c=a+b;
a=b;
b=c;
}
}
}