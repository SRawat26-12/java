class SwapString{
public static void main(String []args)
{
StringBuffer str=new StringBuffer("java");
for(int i=0;i<str.length();i=i+2)
{
char b=str.charAt(i);
str.setCharAt(i, str.charAt(i+1));
str.setCharAt(i+1,b);
}
System.out.println(str.toString());
}
}



