import java.util.*;
public class SecondLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i =0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int largest =arr[0];
        for (int i = 1; i < 5; i++) {
            if(arr[i]>largest){
               largest= arr[i];
            }
     
        }
        int SecondLargest = -1;
        for (int i = 0; i < 5; i++) {
            if(arr[i]>SecondLargest && arr[i]!=largest){
                SecondLargest=arr[i];
            }
            
        }
          System.out.print(" SecondLargest element is: " + SecondLargest);
    }
}