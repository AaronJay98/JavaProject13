import java.util.ArrayList;

public class LargestMeasurable<T> {
    private T theObject;

    public T getMeasure() {
        return theObject;
    }

    public LargestMeasurable(T inputObject) {
        theObject = inputObject;
    }

    static <T extends Comparable<T>> T largestElem(ArrayList<LargestMeasurable<T>> arr) {
        LargestMeasurable<T> returnObject;
        if(arr.isEmpty()) {
            return null;
        }
        returnObject = arr.get(0);
        for(LargestMeasurable<T> curObject: arr) {
            if(curObject.getMeasure().compareTo(returnObject.getMeasure()) > 0) {
                returnObject = curObject;
            }
        }
        return returnObject.getMeasure();
    }
}
