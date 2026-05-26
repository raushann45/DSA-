public class Question{
   static int Even(int Start, int End){
      short sum=0;
        for(int i=Start;i<=End;i++){
            if(i%2==0){
                sum += i;
            }
        }
        return sum;

   }
   public static void main(String[] args) {
       int result = Even(10,20);
   System.out.println(result);

   }
}