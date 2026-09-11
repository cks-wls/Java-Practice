package middle1.exception.basic.checked;

// Exception을 상속받은 예외는 체크 예외가 된다.
public class MyCheckedException extends Exception {
    // 예외 메시지를 보관
    public MyCheckedException(String message) {
        super(message);
    }
}
