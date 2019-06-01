package lock;

public class TestSynchronized implements Runnable {
    static Integer i =0;
    public  static  TestSynchronized testSynchronized = new TestSynchronized();
    @Override
    public void run() {
        for(int j =0 ; j<1000000;j++){
            synchronized (testSynchronized){
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(testSynchronized);
        Thread t2 = new Thread(testSynchronized);
        t1.start();t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);

    }
}
