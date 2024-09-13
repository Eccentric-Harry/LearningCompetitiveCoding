import java.io.*;
import java.util.*;

class Congruence {
    long a, m;

    public Congruence(long a, long m) {
        this.a = a;
        this.m = m;
    }
}

public class ChineseRemaniderTheorem {
    public static long modInverse(long a, long m) {
        long m0 = m, t, q;
        long x0 = 0, x1 = 1;

        if (m == 1) {
            return 0;
        }

        while (a > 1) {
            // q is quotient
            q = a / m;
            t = m;

            // m is remainder now, process same as Euclid's algo
            m = a % m;
            a = t;
            t = x0;

            x0 = x1 - q * x0;
            x1 = t;
        }

        // Make x1 positive
        if (x1 < 0) {
            x1 += m0;
        }

        return x1;
    }

    public static long chineseRemainderTheorem(int[] num, int[] rem, int n) {
        long M = 1;
        for (int i = 0; i < n; i++) {
            M *= num[i];
        }

        long solution = 0;
        for (int i = 0; i < n; i++) {
            long a_i = rem[i];
            long M_i = M / num[i];
            long N_i = modInverse(M_i, num[i]);
            solution = (solution + a_i * M_i % M * N_i) % M;
        }

        // Make sure the solution is non-negative
        if (solution < 0) {
            solution += M;
        }

        return solution;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] rem = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            rem[i] = sc.nextInt();
        }
        System.out.println(chineseRemainderTheorem(num, rem, n));
    }
}
