public class SumOfSubArrays{
    public static void SumOfSubarrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j = i;j<arr.length;j++){
               int end = j;
               int sum = 0;
               for(int k =start; k<=end;k++){
                sum += arr[k] ;
               }
             System.out.println("Sum = " + sum);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};
    SumOfSubarrays(arr);
}
}