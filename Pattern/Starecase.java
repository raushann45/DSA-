public class Starecase {
    public static void main(String[] args) {

        int star = 2;

        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= star; j++) {
                System.out.print(". ");
            }

            System.out.println();

            // After every 2 rows increase stars by 2
            if (i % 2 == 0) {
                star = star + 2;
            }
        }
    }
}