import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Testing printElements static method: ");
        ArrayList<Integer> printArr = new ArrayList();
        printArr.add(5);
        printArr.add(9);
        printArr.add(1);
        printArr.add(10);
        printArr.add(0);
        printArr.add(4);
        printArr.add(9);
	    PrintElem.printElements(printArr);


        System.out.println("");
        System.out.println("Testing minmax static method: ");
	    MyDouble[] minmaxArr = {new MyDouble(5), new MyDouble(9), new MyDouble(1),
                                new MyDouble(10), new MyDouble(0), new MyDouble(4),
                                new MyDouble(9)};
	    Pair<MyDouble,MyDouble> doublePair;

        doublePair = PairUtil.minmax(minmaxArr);
        System.out.println("Minimum is: " + doublePair.getFirst().getMeasure());
        System.out.println("Maximum is: " + doublePair.getSecond().getMeasure());


        System.out.println("");
        System.out.println("Testing Measurable generic class static method: ");
        ArrayList<LargestMeasurable<Integer>> measurableArr = new ArrayList<>();
        measurableArr.add(new LargestMeasurable<Integer>(5));
        measurableArr.add(new LargestMeasurable<Integer>(9));
        measurableArr.add(new LargestMeasurable<Integer>(1));
        measurableArr.add(new LargestMeasurable<Integer>(10));
        measurableArr.add(new LargestMeasurable<Integer>(0));
        measurableArr.add(new LargestMeasurable<Integer>(4));
        measurableArr.add(new LargestMeasurable<Integer>(9));
        System.out.println("Largest element is: " + LargestMeasurable.largestElem(measurableArr));
    }
}
