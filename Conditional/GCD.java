     import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int gcd = 1;
     while(min != 0){
            int rem = max % min;
            max = min;
            min = rem;  
        }
        System.out.println(max);
    }
}