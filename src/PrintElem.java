public class PrintElem {
    public static <E, T extends Iterable<E>> void printElements(T theObject) {
        String outputString = "";
        for(E curE : theObject) {
            outputString += curE.toString() + ", ";
        }
        System.out.println(outputString);
    }
}
