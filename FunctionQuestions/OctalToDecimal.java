import java.util.*;
public class OctalToDecimal{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int power = 0;
        while(n>0){
           int rem = n%10; // retrive digit from last
           n = n/10; // removed digit from last..
           ans += rem * (int)Math.pow(8,power++);
        }
      System.out.println(ans);
    }
}