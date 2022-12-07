public class App {
    public static void main(String[] args) throws Exception {
        TransportasiAir transAir = new TransportasiAir(20, 25000);
        transAir.informasi();
        transAir.berlayar();
        transAir.berlabuh();
        System.out.println("");

        Kapal kapal1 = new Kapal(50, 50000, "Jet");
        kapal1.informasi();
        kapal1.berlayar();
        kapal1.berlayar(20);
        kapal1.berlabuh();
        System.out.println("");

        Sampan sampan1 = new Sampan(10, 5000, 2);
        sampan1.informasi();
        sampan1.berlayar(2);
        sampan1.berlabuh();
        sampan1.berlabuh(1);
    }
}
