import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        Scanner input = new Scanner(System.in);
        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba Kodluyotuz Bankasına Hoş Geldiniz.");
                do {

                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatıracağınız para miktarı :");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Para Miktarı :");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;
                    }

                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}


































