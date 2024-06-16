import java.util.Scanner;
public class Names
{
public static void main(String []args)
{
String arr[]=new String[10];
Scanner sc=new Scanner(System.in);
System.out.println("enter names");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.next();

}
for(int i=0;i<arr.length;i++)
{
if(arr[i].endsWith("h"))
System.out.println(arr[i]+" ");
}
}
}





