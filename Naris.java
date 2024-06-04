import java.util.Scanner;
class Naris
{
int count=0;double sum=0;
int countDigit(int n)
{
while(n!=0)
{
int r=n%10;
count++;
n=n/10;
}
return count;
}
boolean naris(int n)
{
int c=n;
int l=countDigit(n);
while(n!=0)
{
int r=n%10;
sum=sum+Math.pow(r,l);
n=n/10;
}
if(sum==c)
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
System.out.println("Enter number");
int n=sc.nextInt();
Naris t=new Naris();
System.out.println(t.naris(n));
}
}



