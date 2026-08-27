package basic.extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20); // super를 내가 직접 정의 해야함
        System.out.println("ClassC 생성자");
    }
}
