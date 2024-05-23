import java.util.Scanner;
class Month
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String monthName="";
int DaysInMonth=0;
System.out.println("input a month number");
int m=sc.nextInt();
System.out.println("input a year");
int y=sc.nextInt();
switch(m)
{
case 1:
monthName="January";
DaysInMonth=31;
break;
case 2:
monthName="febrauary";
if((y%4==0)||(y%400==0)&&(y%100!=0))
{
DaysInMonth=29;
}
else
{
DaysInMonth=28;
}
break;
case 3:
monthName="march";
DaysInMonth=31;
break;
case 4:
monthName="Aprail";
DaysInMonth=30;
break;
case 5:
monthName="may";
DaysInMonth=31;
break;
case 6:
monthName="june";
DaysInMonth=30;
break;
case 7:
monthName="july";
DaysInMonth=31;
break;
case 8:
monthName="august";
DaysInMonth=31;
break;
case 9:
monthName="september";
DaysInMonth=30;
break;
case 10:
monthName="october";
DaysInMonth=31;
break;
case 11:
monthName="november";
DaysInMonth=30;
break;
case 12:
monthName="December";
DaysInMonth=31;
}
System.out.println(monthName+" "+y+"has"+DaysInMonth+"days");
}
}