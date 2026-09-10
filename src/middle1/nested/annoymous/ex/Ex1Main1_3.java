package middle1.nested.annoymous.ex;

import java.util.Random;

public class Ex1Main1_3 {
    public static void main(String[] args) {
        
        hello(new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });
        hello(new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        // 코드조각
        process.run();
        System.out.println("프로그램 종료");

    }


}