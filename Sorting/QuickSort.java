import java.util.Scanner;

public class Main {
    // Fix the declaration of the partition method and parameter names.
    static int partition(int a[], int start, int end) {
        int pivot = a[end];
        int pIndex = start;

        for (int i = start; i < end; i++) {
            if (a[i] < pivot) {
                int t = a[pIndex];
                a[pIndex] = a[i];
                a[i] = t;
                pIndex++;
            }
        }

        int t = a[pIndex];
        a[pIndex] = a[end];
        a[end] = t;

        return pIndex;
    }

    public void quickSort(int a[], int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quickSort(a, start, p - 1);
            quickSort(a, p + 1, end);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main m = new Main();
        m.quickSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
