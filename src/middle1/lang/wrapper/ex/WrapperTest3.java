package middle1.lang.wrapper.ex;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        // str을 Integer로 변환해서 출력해라
        Integer integer1 = Integer.valueOf(str);
        // Integer를 int로 변환해서 출력해라
        int int1 = integer1.intValue();
        // int를 Integer로 변환해서 출력해라
        Integer integer2 = Integer.valueOf(int1);

        System.out.println("integer1 = " + integer1);
        System.out.println("int1 = " + int1);
        System.out.println("integer2 = " + integer2);
        // 오토박싱, 오토언박싱 사용 금지
    }
}
