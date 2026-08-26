package basic.final1;

public class ConstructInit {
    final int value;

    // final을 필드에 넣으면 생성자를 통해 초기화를 해야함
    public ConstructInit(int value) {
        this.value = value;
    }
}
