package middle1.lang.wrapper.ex;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";
        // 문자로 입력된 str1, str2 두 수의 합
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        System.out.println("str1 + str2 = " + Integer.sum(num1, num2));
    }
}
