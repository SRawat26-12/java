class Counting {
public static void main(String []args)
{
 String str = "The string where the word the present more than once. ";
String word="the";

    String a[] = str.split(" ");
    int count = 0;
    for (int i = 0; i < a.length; i++) 
    {
    if (word.equals(a[i]))
        count++;
    }
System.out.println(count);
}
 

}
 
