class ReplaceVowel
{
public static void main(String []args)
{
StringBuffer str=new StringBuffer("welcome");
for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);
if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u')
{
str.replace(i,i+1,"b");
}
}
System.out.println(str);
}
}
