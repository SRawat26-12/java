public class Word
{
public static void main(String []args)
{
int count=0;
String s="Welcome to Bhopal";
String  ch[]=s.split(" ");
for(int i=0;i<ch.length;i++)
{
count++;
}
System.out.println(count);

}
}


