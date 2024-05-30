import java.util.Scanner;
class Goldbach
{
static boolean isPrime(int n)
{
int c=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
}
}
if(c==2)
{
return true;
}
else
{
return false;
}
}

public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("prime pairs are:");
for(int i=3;i<=n/2;i++)
{
int a=i;
int b=n-i;
if(isPrime(a)&&isPrime(b))
System.out.println(a+" + "+b+" = "+n);
}
}
}




