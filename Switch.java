import java.util.Scanner;
class Switch
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any charcter");
char c=sc.next().charAt(0);
switch(c)
{
case 'a':
case 'A':
System.out.println("it s vowel");
break;
case 'e':
case 'E':
System.out.println("it s vowel");
break;
case 'i':
case 'I':
System.out.println("it s vowel");
break;
case 'o':
case 'O':
System.out.println("it s vowel");
break;
case 'u':
case 'U':
System.out.println("it s vowel");
break;
default:
System.out.println("it is not vowel");
}
}
}






