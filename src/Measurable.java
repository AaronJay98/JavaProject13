import java.util.ArrayList;

public interface Measurable<T> {
    double getMeasure();
}
//import java.util.ArrayList;
//
//public class Measurable<T> {
//    private T theObject;
//
//    public Measurable(T inputObject) {
//        theObject = inputObject;
//    }
//
//    double getMeasure() {
//        return theObject.hashCode();
//    }
//
//    public static <T> T largestElem(ArrayList<Measurable<T>> arr) {
//        Measurable<T> returnObject;
//        if(arr.isEmpty()) {
//            return null;
//        }
//        returnObject = arr.get(0);
//        for(Measurable<T> curObject: arr) {
//            if(curObject.getMeasure() > returnObject.getMeasure()) {
//                returnObject = curObject;
//            }
//        }
//
//        return returnObject.theObject;
//    }
//}

