package middle1.lang.string.ex;

public class TestString7 {
    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        // java라는 단어를 jvm으로 변경
        String result = input.replace("java", "jvm");
        System.out.println(result);
    }
}
