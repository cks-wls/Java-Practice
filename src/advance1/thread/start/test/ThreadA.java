package advance1.thread.start.test;

import static advance1.util.MyLogger.log;

public class ThreadA implements Runnable {
    @Override
    public void run() {
        while (true) {

            log("A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
