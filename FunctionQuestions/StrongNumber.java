import java.util.*;
public class StrongNumber {
    public static int calFact(int n){
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact *= i;
        }

        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = n;
        int sum = 0;

        while(n > 0){
            int x = n%10;
            n = n/10;
            sum = sum + calFact(x);
        }

        System.out.println(sum);

        System.out.println(sum == num);
    }
}