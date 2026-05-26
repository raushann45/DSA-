public class SecondLastEven{
    public static boolean Second_last(int n){
        n = n/10;
        int second_last = n % 10;
        if(second_last % 2==0){
            return true;
        } 
        return false;
      

    }
    public static void main(String[] args) {
        boolean result = Second_last(123);
           System.out.println(result);
    }
}