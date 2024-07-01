import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 2, 1, 8, 11};
        int n = arr.length;
        int pos, i, num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        num = sc.nextInt();
        System.out.println("Enter position (0 to " + n + "):");
        pos = sc.nextInt();

        if (pos < 0 || pos > n) {
            System.out.println("Invalid position");
            return;
        }

        
        int newArr[] = new int[n + 1];

        
        for (i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

       
        newArr[pos] = num;

        
        for (i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("New array:");
        for (i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}