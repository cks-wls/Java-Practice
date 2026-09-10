package middle1.nested.annoymous.ex;

import java.util.Random;

public class Ex1Main1_4 {
    public static void main(String[] args) {
        // 람다 사용 -> 이후에 다룰 예정(람다는 메서드를 매개변수로 전달할 수 있다 정도만 알아두면 됨)
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });
        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
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