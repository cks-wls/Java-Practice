package middle2.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    // 사용자에게 n개의 정수를 입력받아서 List에 저장하고, 입력 순서대로 출력
    // 0 을 입력하면 입력을 종료하고 결과를 출력
    // 출력시 , 를 사용해서 구분, 마지막에는 쉼표를 넣지 않는다.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int num = sc.nextInt();
            if (num != 0) {
                list.add(num);
            } else {
                break;
            }
        }
        System.out.println("출력");
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + ", ");
            } else {
                System.out.print(list.get(i));
            }

        }

    }
}
