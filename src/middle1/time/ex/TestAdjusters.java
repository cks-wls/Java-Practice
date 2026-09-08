package middle1.time.ex;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;
        // 입력받은 월의 첫날 요일과 마지막날 요일을 구해라

        LocalDate dt = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = dt.getDayOfWeek();
        DayOfWeek lastDayOfWeek = dt.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
