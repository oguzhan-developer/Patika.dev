import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String inUsername, inPassword;
        final String USERNAME = "patika", PASSWORD = "developer";

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        inUsername = input.next();

        System.out.print("Şifreniz: ");
        inPassword = input.next();

        if(inUsername.equals(USERNAME) && inPassword.equals(PASSWORD))
        {
            System.out.print("Giriş Başarılı!");
        }
        else
        {
            System.out.println("Şifre Yanlış");
            System.out.print("Şifrenizi Sıfırlamak İster misiniz? [Evet için 1 , Hayır içi 2]");
            int secim = input.nextInt();
            if(secim == 1){

                System.out.print("Yeni Şifrenizi Giriniz: ");
                String newPassword = input.next();
                if(newPassword.equals(PASSWORD))
                System.out.println("Yeni şifre eskisiyle aynı olamaz!");
                else {
                    System.out.println("Şifreniz Değiştirildi.");
                    inPassword = newPassword;
                }

            }

        }
        input.close();
    }
}
