package middle1.lang.string.ex;

public class TestString8 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        // 이메일의 ID 부분과 도메인 부분을 분리하라
        String[] arr = email.split("@");
        System.out.println("ID : " + arr[0]);
        System.out.println("Domain : " + arr[1]);
    }
}
