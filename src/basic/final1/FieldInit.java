package basic.final1;

public class FieldInit {
    // static final이 붙으면 상수로 인지 -> 전부 대문자로 표기해야함
    static final int CONST_VALUE = 10;
    // 초기값을 할당한 경우에는 생성자를 통해 초기값을 허용하지 않는다.
    final int value = 10;
}
