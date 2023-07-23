import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kg;
        float boy;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz :");
        kg = scan.nextDouble();

        System.out.println("Boyunuzu Metre Cinsinden Gitiniz : ");
        boy = scan.nextFloat();

         double vke = kg / (boy * boy);
        System.out.println("Vücut Kitle Endeksiniz : "+ vke);
    }
}