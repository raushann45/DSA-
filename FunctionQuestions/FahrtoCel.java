public class FahrtoCel{
    public static int FahtoCel(int f){
        int c=(f-32)*5/9;
        return c;
    }
    public static void main(String[] args) {
        int result=FahtoCel(45);
        System.out.println(result);

    }
}