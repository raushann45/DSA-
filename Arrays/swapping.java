import java.util.Arrays;
public class swapping{
     public static void swap(int [] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
     }
     public static void main(String[] args) {
        int arr [] = {1,2,4,6,8};
        swap(arr,2,3);
         System.out.println(Arrays.toString(arr));
     }
}