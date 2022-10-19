import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik = s.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = s.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = s.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = s.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = s.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = s.nextInt();

        double ort = (matematik+fizik+kimya+turkce+tarih+muzik) / 6;

        boolean sonuc = ort > 60 ? true : false;

        String sonucText = (sonuc) ? "Geçtiniz." : "Kaldınız.";
        
        System.out.print("Notunuz: " + ort+ " ," + sonucText); 

    }
}
