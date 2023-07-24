import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz : ");
        a = scan.nextInt();
        for(int i=a; i>=1;i--){
            for( int k= 1; k <= a-i; k++){
                System.out.print(" ");
            }
            for (int j= 1;j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}