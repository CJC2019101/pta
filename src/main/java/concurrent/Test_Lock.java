package concurrent;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author JianfeiChen
 * @date 2020/7/21 13:54
 * @Description Java并发访问
 */
public class Test_Lock {

    public static void main(String[] args) throws Exception {
        // 线程并发访问myThreadLock内的数据
        MyThread_Lock myThreadLock = new MyThread_Lock("thread" );
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(myThreadLock);
            threads[i].start();
        }

    }
}

class Sale_Ticket {
    private static int ticket = 100;
    // 公平锁、显示锁
    private Lock obvious_Lock = new ReentrantLock();

    public void sale() {
        while (ticket > 0) {
            obvious_Lock.lock();
            if (ticket==0){
                System.out.println("票已售完");
            }
            System.out.println(Thread.currentThread().getName() + "：" + ticket--);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                obvious_Lock.unlock();
            }
        }
    }
}

class MyThread_Lock implements Runnable {

    private Sale_Ticket sale_ticket = new Sale_Ticket();
    private String name;


    public MyThread_Lock(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        sale_ticket.sale();
    }


}



