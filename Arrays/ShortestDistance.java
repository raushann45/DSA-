import java.util.*;
public class ShortestDistance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter  elements:");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = -1;
     for (int i = 0; i < arr.length; i++) {
         if(arr[i]%2==0){
              for(int j=i+1;j<n;j++){
                if(arr[j]%2==0){
                    if(res==-1) res = j-1;
                    res = Math.min(res,j-i);
                    break;
                }
              }
         }
         
     }
     System.out.println(res);
    }
}