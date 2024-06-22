class C3
{
public static void main(String []args)
{
int A=0,D=0,S=0;
String s="Welcome to w3resource.com";
char ch[]=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z')
{
A++;
}
else if(ch[i]>='0'&&ch[i]<='9')
{
D++;
}
else
{

S++;
}
}
System.out.println("Alphabets:"+A);
System.out.println("Digits:"+D);
System.out.println("Special Character:"+S);
}
}

