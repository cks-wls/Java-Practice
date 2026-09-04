package middle1.lang.string.ex;

public class TestString6 {
    public static void main(String[] args) {
        String original1 = "      Hello Java    ";
        // 문자의 양쪽 공백을 제거
        String result = original1.trim();
        System.out.println(result);
    }
}
