class CountWord
{
public static void main(String []args)
{
String str[]=new String[20];
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
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

