import java.util.*;

public class SegmentedSieve {
  static int n = 1000000;
  static boolean box[] = new boolean[n + 1];

  static void generatSeve() {
    for (int i = 2; i <= n; i++) {
      box[i] = true;
    }

    for (int i = 2; i * i <= n; i++) {
      if (box[i]) {
        for (int j = i * i; j <= n; j += i) {
          box[j] = false; 
        }
      }
    }
  }

  static List<Integer> getMarkprime(int n) {
    List<Integer> ans = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
      if (box[i]) {
        ans.add(i);
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int l = 2;
    int r = 23;

    if ((r - l) > 1000000) {
      System.out.println("please enter a valid range");
      return;
    }

    generatSeve();
    List<Integer> Markprime = getMarkprime((int) Math.sqrt(r));
    int dummy[] = new int[r - l + 1];

    for (int i = 0; i <= r - l; i++) {
      dummy[i] = 1;
    }

    for (int pr : Markprime) {
      int firstMul = (l / pr) * pr;
      if (firstMul < l) {
        firstMul += pr;
      }

      for (int i = Math.max(firstMul, (pr * pr)); i <= r; i += pr) {
        dummy[i - l] = 0;
      }
    }

    for (int i = l; i <= r; i++) {
      if (dummy[i - l] == 1) {
        System.out.println(i);
      }
    }
  }
}