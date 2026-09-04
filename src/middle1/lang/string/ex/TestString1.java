package middle1.lang.string.ex;

public class TestString1 {
    public static void main(String[] args) {
        String url1 = "https://www.example.com";
        //url이 https://로 시작하는지 확인해라
        boolean result = url1.startsWith("https://");
        System.out.println("result = " + result);
    }
}
