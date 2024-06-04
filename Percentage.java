class Percentage
{
public static void main(String []args)
{
int math,english,science,art,computer;
math=45;
english=68;
science=78;
art=48;
computer=78;
System.out.println("total marks out of 500:");
int total=math+english+science+art+computer;
double per=total/5;
System.out.println("percentage is:"+per);
}
}