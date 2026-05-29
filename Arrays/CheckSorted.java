import java.util.*;
public class CheckSorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i =0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        boolean sorted = true;
        for (int i = 0; i < arr.length-1; i++) {
          if(arr[i]>arr[i+1]){
           sorted = false;
           break;
          }
        }
            
            if(sorted){
                System.out.println("Sorted");
            } else {
                System.out.println("Not sorted");
            }
            }
     
        }
    
