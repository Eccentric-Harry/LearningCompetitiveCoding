import java.util.*;
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minI = i;  
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minI]) {
                    minI = j;
                }
            }
            swap(arr, i, minI);  
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
    }
}