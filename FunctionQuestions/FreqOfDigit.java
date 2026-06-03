public class FreqOfDigit{
    public static int DigFreq(int n , int dig){
        int count = 0;
        for (int i = 0; i < n; i++) {
            int rem = n % 10;
            if(rem==dig){
                count++;
            }
            n = n/10;
        }
        return count;

    }
    public static void main(String[] args) {
      int ans = DigFreq(12341234,2);
      System.out.println(ans);

    }
}