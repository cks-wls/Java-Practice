package middle1.lang.math.ex;

import java.util.Random;

public class LottoGenerator {
    // 로또 번호를 자동으로 만들어주는 자동 생성기 만들기
    // 1~45 사이 6개의 숫자
    // 각 숫자는 중복되면 안됨
    // 실행할때마다 결과가 달라야 한다.
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;
        while (count < 6) {
            // 1부터 45사이의 숫자 생성
            int number = random.nextInt(45) + 1;
            // 중복되지 않은 경우에만 배열에 추가
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }

}
