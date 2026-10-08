package advance1.thread.control;

import advance1.util.ThreadUtils;

import static advance1.util.ThreadUtils.*;

public class CheckedExceptionMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        @Override
        public void run() {
            sleep(1000);
        }
    }
}
