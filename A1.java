class A1
{
public static void main(String [] args)
{
int arr[]={100,20,200,30,500};
int min=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]<min)
min=arr[i];
}
System.out.println("smallest:"+min);
}
}