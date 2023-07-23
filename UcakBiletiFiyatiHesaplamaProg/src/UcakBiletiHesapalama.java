import java.util.Scanner;

public class UcakBiletiHesapalama {

    public static void main(String[] args) {
        // km birim fiyatı : 0.10$
        // 12 yaşından küçükse toplam fiyat  %50 indirimli
        // 12 yaş ve 24 yaş arası ise %10 indirimli
        // 65 yaş üzeri ise %30 indirim
        // Gidiş dönüş alırsa %20 indirim
        // Bu koşullara göre uçak bileti fiyatı hesaplayan program

        Scanner scan= new Scanner (System.in);
        int km, yas, tip;
        System.out.println("Mesafeyi Giriniz:");
        km=scan.nextInt();
        System.out.println("Yaşınızı Giriniz:");
        yas=scan.nextInt();
        System.out.print(" \n Yolculuk Tipini Seçiniz:(1= Tek Gidiş ,  2= Gidiş Dönüş )");
        tip=scan.nextInt();

        double yasIndirimi,normalFiyat,tipindirimi;

        if (km> 0 && yas> 0 && (tip==1|| tip==2)){
            System.out.println("Girdiler Doğru:");
            normalFiyat= km * 0.10;
            if (12< yas){
                yasIndirimi= normalFiyat * 0.5 ; // İndirim oranını hesaplıyorum
            } else if (yas>=12 && yas<=24) {
                yasIndirimi= normalFiyat * 0.10;
            }else if (yas>= 65){
                yasIndirimi= normalFiyat * 0.30;
            }else {
                yasIndirimi= 0;
                normalFiyat -= yasIndirimi; // Fiyattan indirim payını çıkarıyorum
            }if (tip==2) {
                tipindirimi= normalFiyat * 0.20;
                normalFiyat= (normalFiyat - tipindirimi) * 2;}

            System.out.println("Bilet Tutarı: " + normalFiyat + "$");
        }else {
            System.out.println("Girdiler Bilgiler Eksik ya da Hatalı:");
        }
    }
}