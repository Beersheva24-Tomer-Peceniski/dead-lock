package telran.multithreading;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        w1.start();
        w2.start();
    }
}