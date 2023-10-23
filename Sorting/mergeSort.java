import java.util.Scanner;

public class Main {

    void merge(int arr[], int start, int mid, int end) {
        int l = mid - start + 1;
        int r = end - mid;
        int left_subarray[] = new int[l];
        int right_subarray[] = new int[r];

        for (int i = 0; i < l; i++) {
            left_subarray[i] = arr[start + i];
        }
        for (int j = 0; j < r; j++) {
            right_subarray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = start;
        while (i < l && j < r) {
            if (left_subarray[i] <= right_subarray[j]) {
                arr[k] = left_subarray[i];
                i++;
            } else {
                arr[k] = right_subarray[j];
                j++;
            }
            k++;
        }

        while (i < l) {
            arr[k] = left_subarray[i];
            i++;
            k++;
        }

        while (j < r) {
            arr[k] = right_subarray[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main m = new Main();
        m.mergeSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
