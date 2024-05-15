import java.util.Scanner;
class Vowel
{
public static void main(String []args)
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter any character");
ch=sc.next().charAt(0);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='I'||ch=='o'||ch=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonant");
}
}
}