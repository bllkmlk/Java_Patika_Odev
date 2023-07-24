import java.util.Scanner;
public class Main {
    public static int recursive(int a ,int b){
        if(a==0){
            return 1;
        }else if (a == 1){
            return b;
        }
        return b * recursive(a-1,b);
    }
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban Değerini Giriniz : ");
        b = scan.nextInt();

        System.out.println("Üs Değerini Giriniz : ");
        a = scan.nextInt();

        System.out.println(recursive(a ,b));

    }
}