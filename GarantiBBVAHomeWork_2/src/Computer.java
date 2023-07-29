import java.util.Scanner;
public class Computer {
    public boolean computer = false;

    public void openC(){
        if (computer){
            throw new RuntimeException("Bilgisayar zaten açık !");
        }else {
            System.out.println("Bilgisayar açılıyor.. ");
            computer = false;
        }
    }
    public void shutDownC(){
        if (computer){
            computer =false;
            throw new RuntimeException("Bilgisayar Zaten kapalı !");
        }else {
            System.out.println("Bilgisayar kapatılıyor..");
            computer =true;
        }
    }

    public void clickC(){
        System.out.println( "Oynamak istediğiniz konsolu seçiniz?" +"\n" + "1-Playstation" + "\n" + "2-XBox" + "\n"+ "3-Playstation ve XBox");
        Scanner scan = new Scanner(System.in);
         int click= scan.nextInt();

         if (click ==1){
             Playstations playstations = new Playstations();
             playstations.open();
             playstations.addController();
             playstations.gamePlay();
             playstations.shutDown();
         }else if (click ==2){
             XBoxs xBoxs = new XBoxs();
             xBoxs.open();
             xBoxs.addController();
             xBoxs.gamePlay();
             xBoxs.shutDown();
         }else if (click==3){
             Playstations playstations1 = new Playstations();
             XBoxs xBoxs1 =new XBoxs();
             playstations1.open();
             xBoxs1.open();
             playstations1.addController();
             xBoxs1.addController();
             playstations1.gamePlay();
             xBoxs1.gamePlay();
             playstations1.shutDown();
             xBoxs1.shutDown();
         }else {
             System.out.println("Hatalı sayı girdiniz !");
         }
    }
}
