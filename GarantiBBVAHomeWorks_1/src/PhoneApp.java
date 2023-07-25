public class PhoneApp extends Main{

    SmartPhone[] sPhone = new SmartPhone[]{
            new SmartPhone(10, " Xiaomi ", 8500, 128, 123456789, 8, 48),
            new SmartPhone(11, " Apple ", 17500, 64, 234567890, 4, 12),
            new SmartPhone(12, " Samsung ", 15500, 256, 345678901, 12, 64),
            new SmartPhone(13, " Casper ", 11750, 128, 456789012, 6, 24),
            new SmartPhone(14, " Oppo ", 10250, 512, 567890123, 16, 108)};
    public static Double calculateTotalPrice(SmartPhone[] sPhone){
        double totalPrice = 0.0;
        for (SmartPhone smartPhone : sPhone){
            totalPrice += smartPhone.getPrice();
        }
        return totalPrice;
    }

}
