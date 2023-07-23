import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float armutf = 2.14F;
        float elmaf = 3.67F;
        float domatesf = 1.11F;
        float muzf = 0.95F;
        float patlıcanf = 5.00F;
        int kg;
        Scanner scan = new Scanner(System.in);

        System.out.print("Armut Kaç kilo ? "  );
         double armut = scan.nextFloat();

        System.out.print("Elma Kaç kilo ? ");
        double elma = scan.nextFloat();

        System.out.print("Domates Kaç kilo ? ");
        double domates = scan.nextFloat();

        System.out.print("Muz Kaç kilo ? " );
        double muz  = scan.nextFloat();

        System.out.print("Patlıcan Kaç kilo ? ");
        double patlıcan = scan.nextFloat();

        double total = (armut *armutf)+(elma*elmaf)+(domatesf*domates)+(muz*muzf)+(patlıcan*patlıcanf);

        System.out.println( "Toplam Tutar :" + total);







    }
}