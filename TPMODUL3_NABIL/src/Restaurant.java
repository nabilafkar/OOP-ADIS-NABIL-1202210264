public class Restaurant implements Runnable {
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodnumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static Object getLock() {
        return lock;
    }


    public static int getFoodnumber() {
        return foodnumber;
    }


    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public void makeFood() {
        synchronized(Restaurant.lock){
            if (waitingForPickup){
                try {
                    System.out.println("Restaurant : menunggu waiter untuk mengantar makanan");
                    Restaurant.lock.wait();

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            waitingForPickup = true;
            System.out.println("Restauran : Membuat makanan nomor " + foodnumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant : minta waiter untuk mengambil makanan");
        }
    }




}
