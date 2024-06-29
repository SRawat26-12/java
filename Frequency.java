import java.util.Scanner;

public class Frequency {
    public static void frequency(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " appears " + count + " times");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int n = arr.length;
        System.out.println("Enter array elements:");
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        frequency(arr, n);
    }
}