package telran.multithreading;

public class Worker extends Thread {
    private static final Object mutex1 = new Object();
    private static final Object mutex2 = new Object();

    @Override
    public void run() {
        f1();
        f2();
    }

    private void f1() {
        synchronized (mutex1) {
            synchronized (mutex2) {

            }
        }
    }

    private void f2() {
        synchronized (mutex2) {
            synchronized (mutex1) {

            }
        }
    }
}
