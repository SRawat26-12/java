import java.util.Scanner;
class Time
{
public static void main(String []args)
{
int n,rm;
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int h=n/3600;
rm=n-h*3600;
int m=rm/60;
rm=rm-m*60;
System.out.println("H:"+"M:"+"S:"+"-"+h+":"+m+":"+rm);
}
}



