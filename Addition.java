import java.util.Scanner;
public class Addition{
public static void main(String []args)
{
int A[][]=new int[3][3];
int B[][]=new int[3][3];
Scanner sc=new Scanner(System.in);
int i,j;

System.out.println("enter element of matrix a:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
A[i][j]=sc.nextInt();
}
}
System.out.println("enter element of matrix b:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
B[i][j]=sc.nextInt();
}
}
System.out.println("Addition of matrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(A[i][j]+B[i][j]+" ");
}
System.out.println();
}
}
}