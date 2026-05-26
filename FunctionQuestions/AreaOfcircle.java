public class AreaOfcircle{
    static double area_circle(int r){
          double pi=3.14;
          double area=pi*r*r;
          return area;

    }
    public static void main(String[] args) {
        double res=area_circle(8);
        System.out.println(res);
    }
}