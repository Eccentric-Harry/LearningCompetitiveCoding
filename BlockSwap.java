import java.util.*;
public class BlockSwap {
  public static void swap(int[] arr, int a, int b, int k) {
    for (int i = 0; i < k; i++) {
      int temp = arr[a + i];
      arr[a + i] = arr[b + i];
      arr[b + i] = temp;
    }
  }
  public static void blockSwap(int[] arr, int i, int k, int n) {
    if (k == 0 || k == n)
      return;
    // If first part and second part are of same size
    if (k == n - k) {
      swap(arr, i, n - k + i, k);
      return;
    }
    // If first part of array is of smaller 
    else if (k < n - k) {
      swap(arr, i, n - k + i, k);
      blockSwap(arr, i, k, n - k); // second part of array is taken now
    }
    // If second part of array is of smaller size
    else {
      swap(arr, i, k, n - k);
      blockSwap(arr, n - k + i, 2 * k - n, k);
    }
  }
  public static void main(String args[]) {
    int[] arr = {1,2,3,4,5,6,7};
    int n = 7;
    int k = 2;
    blockSwap(arr, 0, k, n);
    System.out.println("After Rotating the array ");
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
  }
}