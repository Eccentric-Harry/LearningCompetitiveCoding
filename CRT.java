import java.util.Scanner;

// sts sir method class notes 
public class Crt {

  static int crt(int a[], int m[], int p, int n) {

    int result = 0;

    for (int i = 0; i < n; i++) {

      int M = p / m[i]; // M1, M2, M3
      int y = 0;

      for (int j = 1; j <= m[i]; j++) {

        if ((M * j) % m[i] == 1) {

          y = j;
          break;

        }
      }

      result = result + (a[i] * M * y);

    }
    return result % p;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int a[] = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int p = 1;

    int m[] = new int[n];

    for (int i = 0; i < n; i++) {
      m[i] = sc.nextInt();
      p = p * m[i];
    }

    System.out.println(crt(a, m, p, n));

  }

}