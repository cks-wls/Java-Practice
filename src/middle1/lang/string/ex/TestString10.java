package middle1.lang.string.ex;

public class TestString10 {
    public static void main(String[] args) {
        String str = "Hello Java";
        // 문자열을 반대로 뒤집어라
        StringBuilder sb = new StringBuilder(str);
        String result = sb.reverse().toString();
        System.out.println(result);
    }
}
