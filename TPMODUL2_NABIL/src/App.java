public class App {
    public static void main(String[] args) throws Exception {
        //class perangkat
        Perangkat perangkat1 = new Perangkat("Seagate", 8, 1.5f);
        perangkat1.informasi();
        System.out.println("");

        //class Laptop
        Laptop laptop1 = new Laptop("Samsung", 16, 2.8f, true);
        laptop1.informasi();
        laptop1.bukaGame("PUBG");
        laptop1.kirimEmail("sekuymabar@gmail.com");
        laptop1.kirimEmail("cust.PUBG@gmail.com", "mancailyasa@gmail.com");
        System.out.println("");
        
        //class Handphone
        Handphone handphone1 = new Handphone("Sandisk", 8, 2.5f, false);
        handphone1.informasi();
        handphone1.telfon(628213528);
        handphone1.kirimSMS(628522137);
        handphone1.kirimSMS(628133372, 628211533);

    }
}
