import java.util.*;
public class OctalToBinary{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int decimal = 0;
        int power = 0;
        while(n>0){
           int rem1 = n%10; // retrive digit from last
           n = n/10; // removed digit from last..
           decimal += rem1 * (int)Math.pow(8,power++);
        }
        String ans = " ";
        while(decimal>0){
            int rem2 = decimal % 2;
            decimal /= 2;
             ans = rem2 + ans;
        }
        System.out.println(ans);
    }
}