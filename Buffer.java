class Buffer
{
public static void main(String []args)
{
StringBuffer str=new StringBuffer("Welcome Bhopal");
str.insert(8,"to ");
System.out.println(str);
str.replace(3,7,"done");
System.out.println(str);
str.deleteCharAt(2);
System.out.println(str);
str.reverse();
System.out.pritnln(str);
}
}

