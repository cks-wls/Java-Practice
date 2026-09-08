package middle1.time.ex;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        // 2024.01.01 0:0:0 초에 1년 2개월 3일 4시간 후의 시각을 찾아라
        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime plusDt = dt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("기준 시각 : " + dt);
        System.out.println("1년 2개월 3일 4시간 후의 시각 : " + plusDt);
    }
}
