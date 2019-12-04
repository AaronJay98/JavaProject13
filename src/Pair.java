public class Pair<T, S> {
    private T first;
    private S second;

    public Pair(T inputFirst, S inputSecond) {
        first = inputFirst;
        second = inputSecond;
    }

    public void setFirst(T inputFirst) {
        first = inputFirst;
    }

    public void setSecond(S inputSecond) {
        second = inputSecond;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
