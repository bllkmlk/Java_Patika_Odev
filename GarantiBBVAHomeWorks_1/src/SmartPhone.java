public class SmartPhone extends Phone{
    private double price;
    public SmartPhone(){
    }    // no args
    int storage , ram , camera ;
     public SmartPhone(int id , String name ,double price , int storage ,int phoneNumber, int ram , int camera){
         super(id , name , price ,phoneNumber);
         this.storage=storage;
         this.ram = ram;
         this.camera = camera;
     }

    public double getPrice() {
        return price; // main'e price çekmek için kullandım
    }
}
