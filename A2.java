import java.util.Scanner;
class A2
{
public static void main(String []args)
{
int A[][]=new int[3][3];
Scanner sc=new Scanner(System.in);
int r,c;
for(r=0;r<3;r++)
{
for(c=0;c<3;c++)
{
System.out.println("Enter element Index "+r+c+":");
A[r][c]=sc.nextInt();
}
}
System.out.println("Display array element are");
for(r=0;r<3;r++)
{
for(c=0;c<3;c++)
{
System.out.print(A[r][c]+"  ");
}
System.out.println();
}
}
}

