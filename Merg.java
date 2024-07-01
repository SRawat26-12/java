class Merg
{
public static void main(String []args)
{
int arr1[]={1,2,3,4,5};
int arr2[]={6,7,8,9,10};
int arr3[]=new int[12],k=0;
for(int i=0;i<10;i++)
{
arr3[i]=arr1[i];
if(i>=4)
{
arr3[i]=arr2[k++];
}

}
for(int i=0;i<10;i++)
{
System.out.print(arr3[i]+" ");
}
}
}