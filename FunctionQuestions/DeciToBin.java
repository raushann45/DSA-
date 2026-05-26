import java.util.*;
public class DeciToBin{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = " ";
        while(n>0){
            int rem = n % 2;
            n /= 2;
             binary = rem + binary;
        }
        System.out.println(binary);
    }
}