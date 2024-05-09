import java.util.Scanner;


class Digit{
public static void main(String []args)
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int c=n/10%10;
System.out.println(c);
}
}