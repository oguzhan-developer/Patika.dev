import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int km;
        final int BASLANGIC_UCRET = 10;
        double toplamTutar = BASLANGIC_UCRET;

        Scanner input = new Scanner(System.in);
        System.out.print("(KM) Mesafe Giriniz: ");
        km = input.nextInt();
        toplamTutar += km * 2.2;
        if (20 > toplamTutar)toplamTutar = 20;
        System.out.println("Taksimetre Ücreti: " + toplamTutar); 

    }
}
