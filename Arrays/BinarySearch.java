import java.util.Scanner;
public class BinarySearch{
     public static int BSearch(int arr[],int target){
        int i = 0;
        int j = arr.length;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == target){
                return mid;
            } else if(target<arr[mid]){
              j = mid -1;
            } else{
                j = mid+1;
            }
        }
        return -1;
     }


public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = BSearch(arr,target);
        System.out.println(ans);
}
}