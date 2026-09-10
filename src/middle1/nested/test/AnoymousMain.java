package middle1.nested.test;

public class AnoymousMain {
    public static void main(String[] args) {
        // Hello의 익명클래스를 생성하고 hello()를 호출해라
        Hello a = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };
        a.hello();
    }
}
