package verschachtelung;

public class Dreieckszahlen {
    public static void main(String[] args) {
        int max = 15;

        for (int n = 1; n <= max; n++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
