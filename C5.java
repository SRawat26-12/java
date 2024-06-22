class C5
{
public static void main(String []args)
{
String s="w3resource";
char c[]=s.toCharArray();
for(int i=0;i<c.length;i++)
{
for(int j=0;j<c.length-i-1;j++)
{
if(c[j]>c[j+1])
{
char temp=c[j+1];
c[j+1]=c[j];
c[j]=temp;
}
}
}
System.out.println("Ascending order:");
for(int i=0;i<c.length;i++)
{
System.out.print(c[i]);
}
}
}
