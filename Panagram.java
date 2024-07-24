class Panagram{
public static void main(String []args)
{
String str="Abcdefghijklmnopqrstuvwxyz";
 System.out.println(panagram(str.toLowerCase()));

}
public static boolean panagram(String str)
{
if(str.length()<26)
{
return false;
}
else {
for(char ch='a';ch<='z';ch++)
{
if(str.indexOf(ch)<0)
{
return false;
}
}
}
return true;

}
}
