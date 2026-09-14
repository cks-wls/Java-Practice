package middle2.generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입이 결정된다.
        integerBox.set(10);
//        integerBox.set("100");  // Integer 타입만 허용
        Integer integer = integerBox.get(); // Integer 타입 반환(캐스팅 X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
//        stringBox.set(100);
        String str = stringBox.get();
        System.out.println("string = " + str);

        // 원하는 모든 타입 사용가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
