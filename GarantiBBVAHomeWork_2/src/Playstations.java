public class Playstations implements GameController{
    boolean opennP =false; //  Exception fırlatmak için true yapmam gerekiyor.
    boolean shutDownnP = false;

    public void open(){
        if (opennP){
            throw new RuntimeException("Playstation zaten açık !!");
        }else {
            System.out.println("Playstation açıldı");
            opennP =false;
        }
    }
    public void shutDown(){
        if (shutDownnP){
            throw new RuntimeException("Zaten Kapalı ");
        }else {
            System.out.println("Playstation Kapatılıyor !");
            shutDownnP =true;
        }
    }
    public void addController(){
        System.out.println("Playstation eklendi..");
    }

    public void gamePlay(){
        if (opennP){
            opennP =false;
            throw new RuntimeException("Oyun zaten kapalı..");
        }else {
            System.out.println("Oyun başlatılıyor.");
            opennP =true;
        }
    }
}
