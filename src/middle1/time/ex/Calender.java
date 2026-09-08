package middle1.time.ex;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요 : ");
        int month = sc.nextInt();
        System.out.println("Su Mo Tu We Th Fr Sa");

        // 첫번째 날 구하기
        LocalDate dt = LocalDate.of(year, month, 1);
        LocalDate nextDt = LocalDate.of(year, month + 1, 1);
        DayOfWeek firstDay = dt.getDayOfWeek();
        // 해당 달이 몇일인지
        long totalDays = ChronoUnit.DAYS.between(dt, nextDt);
        int totalWeeks = (int) (totalDays / 7) + 1;
        int count = 1;
        int[][] arr = new int[totalWeeks][7];
        int index = startDay(firstDay);
        // 배열에 일자 넣기
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (count > totalDays) continue;
                if (i == 0) {
                    // 처음 시작하는 요일이 뭔지에 따라 달라짐... 월요일이면 0번째 인덱스에 0, ....
                    if (j < index) arr[i][j] = 0;
                    else {
                        arr[i][j] = count;
                        count++;
                    }
                } else {
                    arr[i][j] = count;
                    count++;
                }
            }
        }
        // 출력 부분
        for (int[] val : arr) {
            for (int i = 0; i < val.length; i++) {
                System.out.printf("%2d ", val[i]);
            }
            System.out.println();
        }

    }

    public static int startDay(DayOfWeek startDay) {
        switch (startDay) {
            case DayOfWeek.SUNDAY -> {
                return 0;
            }
            case DayOfWeek.MONDAY -> {
                return 1;
            }
            case DayOfWeek.TUESDAY -> {
                return 2;
            }
            case DayOfWeek.WEDNESDAY -> {
                return 3;
            }
            case DayOfWeek.THURSDAY -> {
                return 4;
            }
            case DayOfWeek.FRIDAY -> {
                return 5;
            }
            case DayOfWeek.SATURDAY -> {
                return 6;
            }
            default -> {
                return 0;
            }
        }
    }
}
