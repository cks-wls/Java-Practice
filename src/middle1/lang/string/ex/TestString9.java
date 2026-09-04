package middle1.lang.string.ex;

public class TestString9 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // fruits를 분리하고 분리한 문자들을 하나로 합쳐라
        String[] splitFruits = fruits.split(",");
        for (String splitFruit : splitFruits) {
            System.out.println(splitFruit);
        }
        String result = String.join("->", splitFruits);
        System.out.println("joinedString = " + result);

    }
}
