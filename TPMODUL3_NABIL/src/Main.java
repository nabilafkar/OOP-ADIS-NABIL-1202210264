import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Restaurant resto = new Restaurant();
        int custid, quantityOrder;

        try {
            System.out.print("Masukkan Id Customer: ");
            custid = scanner.nextInt();

            System.out.print("Masukkan jumlah order: ");
            quantityOrder = scanner.nextInt();

            Thread restoThread = new Thread(resto);
            Waiters waiter = new Waiters(quantityOrder, custid);
            Thread waiterThread = new Thread(waiter);
            restoThread.start();
            waiterThread.start();
            restoThread.join();
            waiterThread.join();

        }catch (Exception e){
            System.out.println(e);
            System.out.println("Input harus integer");
        }
    }
}
