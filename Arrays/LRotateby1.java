import java.util.*;
public class LRotateby1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i =0;i<5;i++){
            arr[i] = sc.nextInt();
        }
         int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
     
        }
        arr[4]=temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        

    }
}