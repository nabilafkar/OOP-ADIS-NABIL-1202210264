public class Waiters implements Runnable {
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 20000;

    public Waiters(int orderQty, int customerID) {
        this.orderQty = orderQty;
        this.customerID = customerID;
    }

    @Override
    public void run() {
        while (true){
            getFood();
            try{
                Thread.sleep(4000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void orderInfo(){
        System.out.println("....order info...");
        System.out.println("ID Customer = "+customerID);
        System.out.println("Quantity Order = "+orderQty);
        int totalprice = orderQty * this.foodPrice;
        System.out.println("Total Food Price = "+totalprice);

    }

    public void getFood(){
        synchronized(Restaurant.getLock()){
            System.out.println("Waiter : Makanan sudah disajikan");
            Restaurant resto = new Restaurant();
            resto.setWaitingForPickup(false);

            if (Restaurant.getFoodnumber() == orderQty+1){
                orderInfo();
                System.exit(0);
            }else{
                resto.getLock().notifyAll();
                System.out.println("Waiter : minta restoran untuk membuat makanan selanjutnya\n");
            }
        }
    }

}

