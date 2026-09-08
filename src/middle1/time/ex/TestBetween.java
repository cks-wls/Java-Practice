package middle1.time.ex;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1,1);
        LocalDate endDate = LocalDate.of(2024, 11,21);
        // 시작 날짜와 목표 날짜를 입력해서 남은 기간과 디데이를 구해라
        Period period = Period.between(startDate, endDate);
        long between = ChronoUnit.DAYS.between(startDate,endDate);
        System.out.println("시작 날짜 : " + startDate);
        System.out.println("목표 날짜 : " + endDate);
        System.out.println("남은 기간 : " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");
        System.out.println("디데이 " + between + "일 남음");
    }
}
