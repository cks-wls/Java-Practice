package basic.final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역변수
        final int data1;
        data1 = 10; // 최초 한번만 할당이 가능
//        data1 = 20; // compile error

        // final 지역변수 2
        final int data2 = 10;
        //data2 = 20;
        method(10);
    }

    static void method(final int parameter) {
//        parameter = 20; // 컴파일 오류
    }

}
