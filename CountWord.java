class CountWord
{
public static void main(String []args)
{
String str[]={"the", "string", "where", "the", "word", "the" ,"present" ,"more" ,"than" ,"once"};
int c=0;
for(int i=0;i<str.length;i++)
{
if(str[i]=="the")
{
c++;
}

}
System.out.println(c);
}
}

