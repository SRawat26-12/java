class Default
{
String name;
float sal;
int depno;
public Default()
{
name="guest";
sal=250000;
depno=10;
}
public void show()
{
System.out.print("Name:"+name+"sal:"+sal+"depno:"+depno);
}
public static void main(String []args)
{
Default d=new Default();
d.show();
}
}