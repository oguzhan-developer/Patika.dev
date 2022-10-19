import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar Giriniz: ");
        double tutar = input.nextDouble();
        if(tutar>1000)
        {
            double kdv = tutar * 0.08;
            System.out.println("KDV Tutarı: " + kdv);
            tutar += kdv;
            System.out.println("KDV'li Fiyat: " + tutar);
        }
        else
        {
            double kdv = tutar * 0.18;
            System.out.println("KDV Tutarı: " + kdv);
            tutar += kdv;
            System.out.println("KDV'li Fiyat: " + tutar);
        }
    }
}
