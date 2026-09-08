package middle1.time.ex;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        // 2024 1월 1일부터 2주 간격으로 5번 출력
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        for(int i = 0; i < 5; i++){
//            System.out.println("날짜 " + (i+1) + " : " + localDate);
//            localDate = localDate.plusDays(14);
            LocalDate nextDate = localDate.plus(2*i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i+1) + " : " + nextDate);
        }
    }
}
