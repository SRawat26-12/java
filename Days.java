import java.util.Scanner;
class Days
{
public static void main(String []args)
{
int n,rm;
Scanner sc=new Scanner(System.in);
System.out.println("Input number of days:");
n=sc.nextInt();
int y=n/365;
rm=n-y*365;
int m=rm/30;
rm=rm-m*30;
System.out.println(y+"years:");
System.out.println(m+"months:");
System.out.println(rm+"days:");
}
}



