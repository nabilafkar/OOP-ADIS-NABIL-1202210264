public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    
    public void informasi(){
        System.out.print("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor sescepat " + processor + " Ghz. ");
        if (fingerprint == true) {
            System.out.println("Selain itu handphone ini juga memiliki Fingerprint");
          } else {
            System.out.println("Selain itu handphone ini TIDAK memiliki Fingerprint");
          }
    }
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke NO "+ no_hp);
    }
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No "+ no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No "+ no_hp1+ " dan ke "+no_hp2);
    }
}
