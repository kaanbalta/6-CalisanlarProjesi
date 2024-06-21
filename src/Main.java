import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Çalışanlar programına hoşgeldiniz");
        String işlemler = "İşlemler \n" +
                "1. Yazılımcı işlemleri\n" +
                "2. Yönetici işlemleri\n" +
                "Çıkış için q ya basın";


        while(true){
            System.out.println("***************************");
            System.out.println(işlemler);
            System.out.println("***************************");
            System.out.print("İşlemi seçiniz : ");
            String işlem = input.nextLine();

            if(işlem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }

            else if(işlem.equals("1")){
                Yazlimci yazlimci = new Yazlimci("Kaan","Balta",501,"Java,c");
                System.out.println("Yazılımcı işlemlerine hoşgeldiniz");
                String yazılımcıİslem = "1. format at\n" +
                        "2. bilgileri goster\n" +
                        "çıkış için q ya basın";
                System.out.println(yazılımcıİslem);
                while (true){

                    System.out.print("İşlemi seçiniz : ");
                    String y_islem = input.nextLine();

                    if(y_islem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor");
                        break;
                    }

                    else if(y_islem.equals("1")){
                        System.out.print("İşletim sistemi giriniz : ");
                        String isletimsistemi = input.nextLine();
                        yazlimci.formatAt(isletimsistemi);
                    }

                    else if(y_islem.equals("2")){
                        yazlimci.bilgileriGoster();
                    }

                    else {
                        System.out.println("Geçersiz yazılımcı işlemi");
                    }

                }
            }

            else if(işlem.equals("2")){

                Yonetici yonetici = new Yonetici("Faruk","sevil",567,10);
                System.out.println("Yönetici işlemlerine hoşgeldiniz");
                String yoneticiİslem = "Yönetici işlemleri\n" +
                        "1. zam yap\n" +
                        "2. bilgileri göster\n" +
                        "çıkış için q";
                System.out.println(yoneticiİslem);
                while (true){

                    System.out.print("İşlemi seçiniz : ");
                    String yon_islem = input.nextLine();

                    if(yon_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor");
                        break;
                    }

                    else if(yon_islem.equals("1")){
                        System.out.print("zam miktarı giriniz");
                        input.nextLine();
                        int zam = input.nextInt();
                        yonetici.zamYap(zam);
                    }

                    else if(yon_islem.equals("2")){
                        yonetici.bilgileriGoster();
                    }

                    else {
                        System.out.println("Geçersiz yönetici işlemi");
                    }

                }

            }

            else {
                System.out.println("Geçersiz işlem");
            }

        }


    }
}