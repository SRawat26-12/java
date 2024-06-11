class DeleteVowel
{
public static void main(String []args)
{
StringBuffer s=new StringBuffer("welcome");
for(int i=0;i<s.length();i++)
{
char  c=s.charAt(i);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
s.delete(i,i+1);
}
}
System.out.println(s);
}
}