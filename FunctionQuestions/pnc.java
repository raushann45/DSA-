import java.util.*;
public class pnc{
    public static int fac(int x){
      int factt=1;
      for(int i =1;i<=x;i++){
        factt *= i;
      }
      return factt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int r = sc.nextInt();
       
       int ncr =fac(n)/fac(r)*fac(n-r);
       System.out.println(ncr);
    //    int npr = fac(n)/fac(n-r);
    //    System.out.println(npr);
    }
}