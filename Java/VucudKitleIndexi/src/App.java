import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();
        input.close();
        double index = kilo/ (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + index );
    }
}
