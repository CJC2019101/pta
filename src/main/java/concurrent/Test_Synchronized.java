package concurrent;

/**
 * @author JianfeiChen
 * @date 2020/7/21 15:16
 * @Description concurrent
 */
public class Test_Synchronized {
    public static void main(String[] args) {
        // 线程并发访问thread_sync的数据
        MyThread_Sync thread_sync = new MyThread_Sync();
        Thread t1 = new Thread(thread_sync);
        Thread t2 = new Thread(thread_sync);
        Thread t3 = new Thread(thread_sync);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Sale_Ticket_Sync {
    private static int ticket = 100;

    public void sale() {
        while (ticket > 0) {
            synchronized (this) {
                if (ticket == 0) {
                    System.out.println("票已售完");
                    return;
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "：" + ticket--);
            }
        }
    }
}

class MyThread_Sync implements Runnable {

    private Sale_Ticket_Sync saleTicketSync = new Sale_Ticket_Sync();
    private static int tickets = 100;
    private Object o = new Object();

    @Override
    public void run() {
        saleTicketSync.sale();
//        while (tickets > 0) {
//
//            synchronized (this) {
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "：" + tickets--);
//
//            }
//
//        }
    }
}