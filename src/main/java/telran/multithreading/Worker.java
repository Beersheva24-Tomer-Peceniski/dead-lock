package telran.multithreading;

public class Worker extends Thread {
    private static final Object mutex1 = new Object();
    private static final Object mutex2 = new Object();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            f1();
            f2();
        }
    }

    private void f1() {
        synchronized (mutex1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (mutex2) {

            }
        }
    }

    private void f2() {
        synchronized (mutex2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (mutex1) {

            }
        }
    }
}
