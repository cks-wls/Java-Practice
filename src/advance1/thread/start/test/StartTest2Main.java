package advance1.thread.start.test;

public class StartTest2Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new CounterRunnable(), "counter");
        thread.start();
    }
}
