// import java.util.Scanner;
// public class MissingNumber{
//     public static int MissingNum(int arr[],int n ){
//        for(int i=1;i<=n;i++){
//         int flag=0;  // can use boolean also
//         for(int j = 0;j<arr.length;j++){
//             if(arr[j] == i){
//                 flag = 1;
//                 break;
//             }
//         }
//         if(flag==0){
//             return i;
//         }
        
//        }
//        return -1;
//     }
    
// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n-1];

//         for (int i = 0; i < n-1; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println(MissingNum(arr,n));
// }
// }
 // this is brute force and time complexity is O(n^2).
 public static int MissingNum(int[] arr, int n) {
    int totalSum = n * (n + 1) / 2;

        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        return totalSum - arrSum;
 }
 // time complexity will O(n^2)
