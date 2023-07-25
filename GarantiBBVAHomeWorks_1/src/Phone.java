public class Phone extends Product {
    int phoneNumber ;

    public Phone(int id , String name ,double price , int phoneNumber){
        super(id,name,price);// Tek tek yazmak yerine süper metodu ile üst sınıftan çekiyorum.
       this.phoneNumber =phoneNumber;
    }

    public Phone() {
    } // no args
}
