package middle1.lang.string.ex;

public class TestString3 {
    public static void main(String[] args) {
        String str = "hello.txt";
        // str에서 ".txt" 문자열이 언제부터 시작하는지 위치를 찾아서 출력해라
        int index = str.indexOf(".txt");
        System.out.println("index = " + index);
    }
}
