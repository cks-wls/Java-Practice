package middle1.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object클래스의 메서드
        // toString()은 객체에 대한 정보를 제공해줌
        String str = child.toString();
        System.out.println(str);
    }
}
