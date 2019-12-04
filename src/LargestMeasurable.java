import java.util.ArrayList;

public class LargestMeasurable<T> implements Measurable{
    private T theObject;

    public double getMeasure() {
        return theObject.hashCode() ;
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
            if(curObject.getMeasure() > returnObject.getMeasure()) {
                returnObject = curObject;
            }
        }

        return returnObject.getObject();
    }

    public T getObject() {
        return theObject;
    }
}
