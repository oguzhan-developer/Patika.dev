import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int yaricap;
        final double PI = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        yaricap = input.nextInt();

        double alan = PI * yaricap * yaricap;
        double cevre = 2 * PI * yaricap;
        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
    }
}
