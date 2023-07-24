import java.util.Scanner;
public class Main {
    private static void recursive(int m){
        System.out.println(m);
        if(m<=0) {
            return;
        }recursive(m-5);      // Saatlerimi alan metod unutma!!!!!!
        System.out.println(m);
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        n = scan.nextInt();

        System.out.println("Çıktısı : ");
        recursive(n);

    }
}