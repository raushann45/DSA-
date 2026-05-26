import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 10;

        for(int i=1 ;i<=num1;i++){
            if(i% 2 != 0){
                System.out.println(i);
            }
        }
    }
}