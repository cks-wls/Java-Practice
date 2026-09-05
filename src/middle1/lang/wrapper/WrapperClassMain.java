package middle1.lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 삭제 예정, 대신에 valueOf()를 사용
        Integer integerObject = Integer.valueOf(10); // 위와 같음
        // valueOf로 생성하면 풀로 생성한거랑 비슷함(미리 만들어 둠)
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
//        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObject = " + integerObject);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObject.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObject));
        System.out.println("equals : " + (newInteger.equals(integerObject)));
    }
}
