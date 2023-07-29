public class XBoxs implements GameController{
    public boolean opennX =false; // Exception fırlatmak için true yapmam gerekiyor.
    public boolean shutDownnX = false;

    public void open(){
        if (opennX){
            throw new RuntimeException("XBox zaten açık !!");
        }else {
            System.out.println("XBox açıldı");
            opennX =false;
        }
    }
    public void shutDown(){
        if (shutDownnX){
            throw new RuntimeException("Zaten Kapalı ");
        }else {
            System.out.println("XBox Kapatılıyor !");
            shutDownnX =true;
        }
    }
    public void addController(){
        System.out.println("XBox eklendi..");
    }
    public void gamePlay(){
        if (opennX){
            opennX =false;
            throw new RuntimeException("Oyun zaten kapalı..");
        }else {
            System.out.println("Oyun başlatılıyor.");
            opennX =true;
        }
    }


}
