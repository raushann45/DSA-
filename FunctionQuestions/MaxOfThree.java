import java.util.Scanner;
public class MaxOfThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println(Math.max(Math.max(num1,num2),num3));
        //int num4=sc.nextInt();
        //System.out.println(Math.max(num4,(Math.max(Math.max(num1,num2),num3)))); .....max of four
        
    }
}