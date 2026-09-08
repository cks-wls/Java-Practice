package middle1.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println("현재 날짜시간 = " + nowTime);

        LocalDateTime ofTime = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("지정 날짜시간 = " + ofTime);

        // 날짜와 시간 분리
        LocalDate localDate= ofTime.toLocalDate();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = ofTime.toLocalTime();
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산(불변)
        LocalDateTime ofDtPlus = ofTime.plusDays(1000);
        System.out.println("지정 날짜시간 +1000d = " + ofDtPlus );

        LocalDateTime ofDtPlus1Year = ofTime.plusYears(1);
        System.out.println("지정 날짜시간 +1년 = " + ofDtPlus1Year);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowTime.isBefore(ofTime));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowTime.isAfter(ofTime));
        System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? " + nowTime.isEqual(ofTime));

    }
}
