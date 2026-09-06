package middle1.enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN] : ");
        // 등급 선택
        String grade = sc.nextLine();
        // 문자열을 Enum 타입으로 변환
        AuthGrade enumGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + enumGrade.getDescription() + "입니다.");
        System.out.println("==메뉴 목록==");
        switch (enumGrade.getLevel()){
            case 1 -> {
                System.out.println("- 메인 화면");
            }
            case 2 ->{
                System.out.println("- 메인 화면");
                System.out.println("- 이메일 관리 화면");
            }
            case 3 ->{
                System.out.println("- 메인 화면");
                System.out.println("- 이메일 관리 화면");
                System.out.println("- 관리자 화면");
            }
        }

    }
}
