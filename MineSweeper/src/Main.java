import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row , column;
        System.out.println("Mayın Tarlasına Hoşgeldiniz...");
        System.out.println("Lütfen Oynamak İstediğiniz Boyutları Giriniz !");
        System.out.print("Satır Sayısı  :");
        row = scan.nextInt();
        System.out.println("Sütun Sayısı : ");
        column = scan.nextInt();;

        MineSweeper mineSweeper = new MineSweeper( row,column);
        mineSweeper.run();
    }
}