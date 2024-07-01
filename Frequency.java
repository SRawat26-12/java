import java.util.Scanner;
public class Frequency
{
public static void freq(int arr[],int n)
{
for(int i=0;i<n;i++)
{
boolean repeat=false;
for( int j=0;j<i;j++)
{
if(arr[i]==arr[j])
{
repeat=true;
break;
}
}
if(!repeat)
{
int count=0;
for(int j=0;j<n;j++)
{
if(arr[i]==arr[j])
count++;
}
System.out.println(arr[i]+"appear"+count+"times");
}
}
}
public static void main(String []args)
{
int arr[]=new int[6];
int n=arr.length;
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
freq(arr,n);
}
}