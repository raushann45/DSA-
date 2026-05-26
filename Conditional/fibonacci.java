import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int first = 0;
        int second = 1;

        for(int i=1;i<=num1;i++){
            System.out.println(first);
            int next = first+second;
            first = second;
            second = next;
        }
        System.out.println(first);
    }
}