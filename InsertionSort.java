import java.util.Scanner;
class InsertionSort
{
public static void main(String []args)
{
int arr[]=new int[10];
int c;
System.out.println("Enter array elements");
Scanner sc=new Scanner(System.in);
for( c=0;c<5;c++)
{
arr[c]=sc.nextInt();
}
for(c=1;c<5;c++)
{
int min=c;
while(min>0&&arr[min]<arr[min-1])
{
 int t=arr[min];
arr[min]=arr[min-1];
arr[min-1]=t;
min--;
}
}
System.out.println("After insertion sort");
for(c=0;c<5;c++)
{
System.out.println(arr[c]+" ");
}
}
}


