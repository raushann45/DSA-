 import java.util.*;
 public class LinearSearch{
     public static boolean isPresent(int[] arr,int target){
       for (int i = 0; i < arr.length; i++) {
           if(arr[i] == target){
            return true;
           }
       }
    return false;
     }
    public static int linear_Search(int []arr,int target){
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] == target){
            return i;
        }
        }
        return 0;
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
         for (int i = 0; i < arr.length; i++) {
               arr[i] = sc.nextInt();
             
         }
         System.out.println("Enter target element: ");
          int target = sc.nextInt();
          System.out.println(linear_Search(arr,target));
           System.out.println(isPresent(arr,target)); 

      
     }
 }