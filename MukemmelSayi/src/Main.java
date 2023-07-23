import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        a = scan.nextInt();
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                total += i;
            }
        }if(a == total){
            System.out.println(a + " Bir Mükemmel Sayıdır..");
        }else {
            System.out.println(a + " Mükemmel Sayı Değildir..");
        }

    }
}