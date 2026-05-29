import java.util.*;
public class MaxDistance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter  elements:");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int MaxDistance= 0;
     for (int i = 0; i < n; i++) {
              for(int j=1;j<n;j++){
                if(arr[i]==arr[j]){
                    MaxDistance = Math.max(MaxDistance,j-i);
                }
              }
         }  
          System.out.print(MaxDistance);
     }
    }
