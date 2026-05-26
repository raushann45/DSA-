public class Random {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        boolean res = isPrime(9);
        if (res == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
}