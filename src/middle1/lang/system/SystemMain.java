package middle1.lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMills = System.currentTimeMillis();
        System.out.println("currentTimeMills = " + currentTimeMills);

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다. -> os
        System.out.println("getenv= " + System.getenv());

        // 시스템 속성을 읽는다. -> java
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version : " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다. -> 자바가 하는게 아니라 운영체제에 넘김
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
