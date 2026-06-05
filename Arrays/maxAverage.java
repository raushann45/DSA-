public class maxAverage{
       public double findMaxAverage(int[] nums, int k) {
        double average = 0;
        int n = nums.length;
        for(int i=0;i<k;i++){
            average += (double)nums[i]/k;

        }
        double maxAverage = average;
        for(int i=1;i<=n-k;i++){
            average = average - (double)nums[i-1]/k + (double)nums[i+k-1]/k;
            if(average>maxAverage){
                maxAverage = average;
            }
        }
        return maxAverage;
    }
    public static void main(String[] args) {
        int [] nums = {3,6,9,5,7,8};
        maxAverage obj = new maxAverage(); // need to create object for call function beacuse it is non static 
        double ans = obj.findMaxAverage(nums, 4);
         System.out.println(ans);
    }
}