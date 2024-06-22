class C4
{
public static void main(String []args)
{
int vowel=0,consonant=0;
String s="Welcome to W3resource.com";
char[] ch=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
{
vowel++;
}
else if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z')
{
consonant++;
}
}
System.out.println("vowel:"+vowel);
System.out.println("consonant:"+consonant);
}
}
