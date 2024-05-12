import java.util.Scanner;
class Cel
{
public static void main(String []args)
{
float farenheight,celcius;
Scanner sc=new Scanner(System.in);
System.out.println("enter farenheight");
farenheight=sc.nextFloat();
celcius=(farenheight-32)*5/9;
System.out.println(farenheight+"is equal to"+celcius+"in celcius");
}
} 
 