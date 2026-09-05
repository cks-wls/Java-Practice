package middle1.lang.wrapper.ex;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        // str -> Integer
        Integer integer1 = Integer.parseInt(str);
        // Integer -> int
        int int1 = integer1;
        // int -> Integer
        Integer integer2 = int1;
        // 오토박싱, 오토언박싱사용할 것

        System.out.println("integer1 = " + integer1);
        System.out.println("int1 = " + int1);
        System.out.println("integer2 = " + integer2);
    }
}
