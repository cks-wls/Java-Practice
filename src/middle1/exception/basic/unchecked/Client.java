package middle1.exception.basic.unchecked;

public class Client {
    public void call() {
        // 자동으로 예외가 throws됨
        throw new MyUncheckedException("ex");
    }
}
