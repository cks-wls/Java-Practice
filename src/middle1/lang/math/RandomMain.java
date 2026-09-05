package middle1.lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        //Random random = new Random();
        Random random = new Random(); //seed가 같으면 Random의 결과가 같다.(계속 돌려도 똑같은 값이 나온다)

        int i = random.nextInt();
        System.out.println("i = " + i);

        double randomDouble = random.nextDouble(); // 0.0d ~ 1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위로 조회
        int randomRange1 = random.nextInt(10); // 0~9까지 출력
        System.out.println("0 ~ 9 : " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; // 1~10까지 출력
        System.out.println("1 ~ 10 : " + randomRange2);
    }
}
