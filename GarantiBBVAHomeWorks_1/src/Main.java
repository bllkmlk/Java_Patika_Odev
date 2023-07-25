public class Main {
    public static void main(String[] args) {

        PhoneApp phoneApp = new PhoneApp();
        double result = PhoneApp.calculateTotalPrice(phoneApp.sPhone);

        System.out.println(" Toplam : " + result);
    }
}