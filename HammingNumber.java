
import java.util.Scanner;
public class HammingNumber
{
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        boolean flag = true;
        for(int i = 2; i<=num; i++)
        {            if(i!=2&&i!=3&&i!=5)
                
                if(num%i==0&&isPrime(i))
                {
                   
                    flag = false;
                    break;
                }
        }
        if(flag)
        {
            System.out.println(num+" is a Hamming number");
        }
        else
        {
            System.out.println(num+" is Not a Hamming number");
        }
    }
    
    static boolean isPrime(int num)
    {
        boolean flag = true;
        for(int i = 2; i<=num/2; i++)
        {
            if(num%i==0)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
}