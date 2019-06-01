package lock;

import java.util.concurrent.locks.ReentrantLock;

public class TestReenTrantLock implements Runnable{
    static ReentrantLock reentrantLock = new ReentrantLock();
    static  Integer i =0;

    @Override
    public void run() {
        for(int j =0;j<50000000;j++) {
           reentrantLock.lock();
            i++;
            reentrantLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestReenTrantLock t = new TestReenTrantLock();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
