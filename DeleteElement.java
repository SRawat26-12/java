import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int n, i, pos;
        int arr[] = new int[]{3, 2, 1, 8, 11};
        n = arr.length;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position (0 to " + (n - 1) + "):");
        pos = sc.nextInt();
        
        if (pos < 0 || pos >= n) {
            System.out.println("Deletion is not possible");
        } else {
            for (i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            
          
            
            System.out.println("After deletion:");
            for (i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}