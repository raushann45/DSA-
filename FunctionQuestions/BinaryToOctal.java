import java.util.*;
public class BinaryToOctal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans1 = 0; // ans of binary to deci
        int power = 0;
        while(n>0){
           int rem = n%10; // retrive digit from last
           n = n/10; // removed digit from last..
           ans1 += rem * (int)Math.pow(2,power++);
        }
       
     String ans2 = " ";
        while(ans1>0){
            int rem = ans1 % 8;
            ans1 /= 8;
             ans2 = rem + ans2;
        }
        System.out.println(ans2);
    }
}