 import java.util.*;
 public class Basics{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int arr[] = new int[5];
         int n = arr.length;
         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
             
         }
         for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){ // for even no. 
          System.out.print(arr[i] +" ");
            }   
         }
     }
}