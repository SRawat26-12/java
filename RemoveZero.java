class RemoveZero
{
public static void main(String []args)
{
String str="0000123569";
for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);
if(c!='0')
{
System.out.print(c);
}
}

}
}
