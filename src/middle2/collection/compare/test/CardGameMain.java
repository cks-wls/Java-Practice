package middle2.collection.compare.test;

import java.util.*;

public class CardGameMain {
    public static void main(String[] args) {
        // 코드 작성
        // 1. 덱에있는 카드를 랜덤으로 섞음
        // 2. 플레이어는 덱에서 카드를 5장씩 뽐는다.
        // 3. 각 플레이어의 5장의 카드를 정렬된 순서로 보여주기
        // -> 작은 순서대로, 같은 숫자이면 스페이드, 하트, 다이아, 클로버 순으로
        // 4. 카드 숫자의 합계가 큰 플레이어가 승리

        // 카드 문자 배열 정의
        String[] cardShape = {"\u2660", "\u2665", "\u2666", "\u2663"};
        // 숫자 배열 생성
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        // 덱 배열 생성
        ArrayList<String> deck = new ArrayList<>();
        // 덱 생성
        for (int i : number) {
            for (String s : cardShape) {
                deck.add(s + " " + i);
            }
        }
        // 덱 섞기
        Collections.shuffle(deck);
        // 플레이어에게 카드 분배
        int sum1 = 0;
        int sum2 = 0;
        Card[] player1 = new Card[5];
        sum1 = distributeCard(deck, player1, sum1, 0);
        Arrays.sort(player1);
        System.out.print("플레이어1의 카드 : [");
        print(player1, sum1);

        Card[] player2 = new Card[5];
        sum2 = distributeCard(deck, player2, sum2, 5);
        Arrays.sort(player2);
        System.out.print("플레이어2의 카드 : [");
        print(player2, sum2);

        String result = (sum1 > sum2) ? "플레이어1 승리" : (sum1 == sum2) ? "무승부" : "플레이어2 승리";
        System.out.println(result);
    }

    // 카드 분배 메서드
    static int distributeCard(ArrayList<String> deck, Card[] player, int sum, int startIndex) {
        for (int i = startIndex; i < startIndex + 5; i++) {
            String[] splitArr = deck.get(i).split(" ");
            if (i >= 5) {
                player[i - 5] = new Card(splitArr[0], splitArr[1]);
            } else {
                player[i] = new Card(splitArr[0], splitArr[1]);
            }
            sum += Integer.parseInt(splitArr[1]);
        }
        return sum;
    }

    // 출력 메서드
    static void print(Card[] player, int sum) {
        for (int i = 0; i < player.length; i++) {
            if (i == player.length - 1) {
                System.out.print(player[i].getNumber() + "(" + player[i].getShape() + ")");
            } else {
                System.out.print(player[i].getNumber() + "(" + player[i].getShape() + ")" + ", ");
            }
        }
        System.out.print("], 합계 : " + sum);
        System.out.println();
    }
}
