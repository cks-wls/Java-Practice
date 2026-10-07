package advance1.thread.start.test;

import static advance1.util.MyLogger.log;

public class CounterThread extends Thread {
    private static int value = 1;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            log("value : " + value);
            try {
                Thread.sleep(1000);
                value++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
