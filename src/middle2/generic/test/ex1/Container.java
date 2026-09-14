package middle2.generic.test.ex1;

public class Container<T> {
    private T data;

    public T getItem() {
        return data;
    }

    public void setItem(T data) {
        this.data = data;
    }

    public boolean isEmpty() {
        // 만약 데이터가 존재한다면 false, 존재하지 않는다면 true
        return (data != null);
    }
}
