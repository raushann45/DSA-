import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int sum = 0;
        int orig = num1;
        while(num1!=0){
            int temp = num1 % 10;
            sum += temp*temp*temp;
            num1/=10;
        }
        if(sum == orig){
            System.out.println("Armstrong No..");
        }else{
            System.out.println("Not Armstrong..");
        }
    }
}