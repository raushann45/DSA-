public class NumberGuess{
    public static void NumGuess(int n,int guess){
      if(n>guess){
        System.out.print("Too low");
      } else if(n<guess){
      System.out.print("Too high");
      } else {
             System.out.print("Correct guessing");
      }
    }
    public static void main(String[] args) {
    NumGuess(24,25);


    }
}