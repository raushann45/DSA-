import java.util.*;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 80;
        for(int i=1;i<=80;i++){
            if(i*i >=20  && i*i <=num1){
                System.out.println(i*i);
            }
        }
       
    }
}