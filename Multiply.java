import java.util.Scanner;
public class Mul 
{
public static void main(String []args)
{
int arr1[]=new int[3][3];
int arr2[]=new int[3][3];
Scanner sc=new Scanner(System.in);
System.out.println("enter element of first matrix:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println("enter element of second matrix:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println("multiply:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
arr3[i][j]=0;
for(int k=0;k<3;k++)
{
arr3[i][j]+=arr1[i][k]*arr2[k][j];
}
System.out.print(arr3[i][j]+" ");
}
System.out.println();
}
}
}

