class RemoveZero
{
public static void main(String []args)
{
String str="0000123569";
StringBuffer sb=new StringBuffer(str);
sb.removeCharAt(0,4,'0');
System.out.println(sb);
}
}
