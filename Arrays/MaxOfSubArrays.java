

public class  MaxOfSubArrays{
    public static void MaxOfSubArr(int arr[]){
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j = i;j<arr.length;j++){
               int end = j;
               currSum = 0;
               for(int k =start; k<=end;k++){
                currSum += arr[k];
               }
               System.out.println(currSum);
               if(currSum>MaxSum){
               MaxSum = currSum;
            }
            }
          
        }
        System.out.println("max sum is: " +     MaxSum);
    }
    public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};
      MaxOfSubArr(arr);
}
}


// time complexity O(n^3) which is bad 

// now more optimised code(prefix Sum) 
 
   public class  MaxOfSubArrays{
    public static void MaxOfSubArr(int arr[]){
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        int prefix [] = new int[arr.length]; 

        prefix[0] = arr[0];
       
       // to calculate prefix sum
       for(int i =1;i<prefix.length;i++){
           prefix[i] = prefix[i-1] + arr[i];
       }


        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j = i;j<arr.length;j++){
               int end = j;
               currSum = start==0 ? prefix[end] : prefix[end] - prefix[start - 1];
               // agar start 0 hua to index negative ho jayegi...
               
               if(currSum>MaxSum){
               MaxSum = currSum;
            }
            }
          
        }
        System.out.println("max sum is: " +     MaxSum);
    }
    public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};
      MaxOfSubArr(arr);
}
}


// now time complexity is O(n^2) which is less than O(n^3)

// now most optimal code(kadane's algo)
// array ke ander chhota positive aur bada negative ho to uska sum finally negative hi aayega to usko consider nahi krenge uske jagah sum 0 le lenge..
public class  MaxOfSubArrays{
    public static void  kadanes(int arr[]){
       int maxSum = Integer.MIN_VALUE;
       int currSum = 0;
       for (int i = 0; i < arr.length; i++) {
           currSum = currSum + arr[i];
           if(currSum<0){
            currSum = 0;
           }
           maxSum= Math.max(currSum,maxSum);
       }
         System.out.println("Max subarray sum is : " + maxSum);
    }
    public static void main(String[] args) {
    int arr[] = {-2,-4,6,-8,10};
      kadanes(arr);
}
}
