package middle2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    // 영어 단어를 입력하면 한글 단어를 찾아주는 영어 사전
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        System.out.println("== 단어 입력 단계 ==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 q) : ");
            String word = sc.nextLine();
            if (word.equals("q")) break;
            System.out.print("한글 뜻을 입력하세요 : ");
            String meaning = sc.nextLine();
            map.put(word, meaning);
        }
        System.out.println("== 단어 검색 단계 ==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 q) : ");
            String word = sc.nextLine();
            if (word.equals("q")) break;
            if (map.containsKey(word)) {
                System.out.println(word + "의 뜻 : " + map.get(word));
            } else {
                System.out.println(word + "은(는) 사전에 없는 단어입니다.");
            }
        }


    }
}
