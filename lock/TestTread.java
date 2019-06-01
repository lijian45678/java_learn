package lock;

public class TestTread implements Runnable {
   static TestTread testTread = new TestTread();
   static int i =0;
    @Override
    public void run() {
        for(int j =0; j<100000000;j++){
            synchronized(TestTread.class){
                i++;
            }
        }

       }

    public static void main(String[] args) {
        Long t1 = System.currentTimeMillis();
        Thread thread1 = new Thread(testTread);
        Thread thread2 = new Thread(testTread);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i+"  " +(System.currentTimeMillis()-t1));

    }
}

