package middle1.nested.test;

public class OuterClass3 {
    public void myMethod() {
        // LocalClass를 구현하고, hello()메서드 호출
        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
