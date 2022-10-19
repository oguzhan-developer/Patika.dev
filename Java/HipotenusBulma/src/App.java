import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenarını Giriniz: ");
        a = input.nextInt();

        System.out.print("2.Kenarını Giriniz: ");
        b = input.nextInt();

        c = Math.sqrt(a*a + b*b);
        System.out.println("Alınan değerler için hipotenüs: " + c);
    }
}
