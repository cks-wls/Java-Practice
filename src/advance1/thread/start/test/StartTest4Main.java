package advance1.thread.start.test;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new ThreadA(), "Thread-A");
        Thread threadB = new Thread(new ThreadB(), "Thread-B");
        threadA.start();
        threadB.start();
    }
}
