import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int fact = 1;
        int i =1;
        while(i<=num1){
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}