import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a =0 ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç Elemanlı Seri İstersiniz ?");
        a = scan.nextInt();
        int total;
        int one=1;
        int two=2;

        for (int i =2; i<=a;i++){
            total=one+two;
            System.out.println(total);
            one=two;
            two= total;
        }
        System.out.println("Fibonacci : " + a);

    }
}