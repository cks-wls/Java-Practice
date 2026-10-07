package advance1.thread.start;

import static advance1.util.MyLogger.log;

public class InnerRunnableMainV4 {

    public static void main(String[] args) {
        log("main() start");
        // 람다를 배우면 이해 가능
        Thread thread = new Thread(() -> log("run()"));
        thread.start();
        log("main() end");

    }


}
