 public class CountDigit{
        public static int Count(int n){
            int count=0;
            while(n>0) {
                int Dig = n/10;
                count++;
            }
            return count;
        }
        public static void main(String[] args) {
            int result=Count(1234);
            System.out.println(result);
        }
}
