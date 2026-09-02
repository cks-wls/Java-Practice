package middle1.lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        // 새로 생성한 객체를 반환
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }
}
