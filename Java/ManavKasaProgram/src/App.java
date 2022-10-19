import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double armut, elma, domates, muz, patlican, toplam=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? ");
        armut = input.nextDouble();
        armut *= 2.14;
        toplam += armut;
        System.out.print("Elma Kaç Kilo ? ");
        elma = input.nextDouble();
        elma *= 3.67;
        toplam += elma;

        System.out.print("Domates Kaç Kilo ? ");
        domates = input.nextDouble();
        domates *= 1.11;
        toplam += domates;

        System.out.print("Muz Kaç Kilo ? ");
        muz = input.nextDouble();
        muz *= 0.95;
        toplam += muz;

        System.out.print("Patlıcan Kaç Kilo ? ");
        patlican = input.nextDouble();
        patlican *= 5;
        toplam += patlican;
        input.close();
        System.out.print("Toplam Tutar: " + toplam);

    }
}
