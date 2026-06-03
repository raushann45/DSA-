import java.util.Scanner;

public class Substraction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
      int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] result = new int[n2];

        int i = n1 - 1, j = n2 - 1, borrow = 0;

        while (j >= 0) {
            int digitA = (i >= 0) ? a[i] : 0;
            int diff = b[j] - borrow - digitA;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[j] = diff;

            i--;
            j--;
        }

        int idx = 0;
        while (idx < result.length - 1 && result[idx] == 0) {
            idx++;
        }

        while (idx < result.length) {
            System.out.print(result[idx]);
            idx++;
        }

      
    }
}