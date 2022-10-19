import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int sayi1, sayi2, secim;
        double sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        secim = input.nextInt();
        input.close();
        switch(secim)
        {
            case 1:
            sonuc = sayi1+sayi2;break;
            case 2:
            sonuc = sayi1-sayi2;break;
            case 3:
            sonuc = sayi1*sayi2;break;
            case 4:
            sonuc = sayi1/sayi2;break;
            default:
            System.out.println("Hatalı Giriş Yaptınız");
            sonuc = 0;break;
        }

        System.out.print("Sonuç: " + sonuc);

    }
}
