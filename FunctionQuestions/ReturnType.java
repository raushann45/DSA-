public class ReturnType{ 
   public static int Raushan() {
    System.out.println("Good Boy");
    return 5; // value of function Raushan() or hold value as well and it also means function stop from here..
//  System.out.println("Bad Boy"); this print statement not work because ye return ke bad likha h 
   }
    public static void main(String[] args) {
       // Raushan(); ..... value of this function is 5 but it will  not print a value that is 5..ye bs call hoga
      // System.out.println(Raushan());  this will print value as well as functions work
      int x=Raushan();
      System.out.println(7+x);

    }
}