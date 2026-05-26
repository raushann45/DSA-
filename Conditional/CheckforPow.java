import java.util.Scanner;

public class CheckforPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();  
        int n2 = sc.nextInt();  
        

        while(n2%n1==0){
            n2 = n2 / n1;
        }
        if(n2 == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}