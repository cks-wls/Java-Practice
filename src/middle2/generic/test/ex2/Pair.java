package middle2.generic.test.ex2;

public class Pair<T, S> {
    private T firstData;
    private S secondData;

    public T getFirst() {
        return firstData;
    }

    public S getSecond() {
        return secondData;
    }

    public void setFirst(T firstData) {
        this.firstData = firstData;
    }

    public void setSecond(S secondData) {
        this.secondData = secondData;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstData=" + firstData +
                ", secondData=" + secondData +
                '}';
    }
}
