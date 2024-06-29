import java.util.Scanner;

class Quick {
    public static int part(int arr[], int low, int high) {
        int temp;
        int pvt = arr[low];
        int i = low + 1;
        int j = high;
        do {
            while (i <= high && arr[i] < pvt) {
                i++;
            }
            while (j >= low && arr[j] > pvt) {
                j--;
            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } while (i < j);
        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void quick(int arr[], int low, int high) {
        int pv;
        if (low < high) {
            pv = part(arr, low, high);
            quick(arr, low, pv - 1);
            quick(arr, pv + 1, high);
        }
    }

    public static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[]{8, 2, 3, 60, 9, 50};
        int n = arr.length; // Corrected the length of the array
        System.out.print("Array before quick sort: ");
        print(arr, n);
        quick(arr, 0, n - 1);
        System.out.println("Array after quick sort: ");
        print(arr, n);
    }
}