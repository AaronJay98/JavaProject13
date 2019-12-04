public class PairUtil {
    public static <T extends Measurable> Pair<T, T> minmax(T[] arr) {
        T min;
        T max;
        T current;
        if(arr.length > 0) {
            min = arr[0];
            max = arr[0];
        }
        else {
            return null;
        }

        for(int i = 0; i < arr.length; i++) {
            current = arr[i];
            if(current.getMeasure() > max.getMeasure()) {
                max = current;
            }
            else if(current.getMeasure() < min.getMeasure()) {
                min = current;
            }
        }

        return new Pair<T, T> (min, max);
    }
}
