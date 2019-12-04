public class MyDouble implements Measurable {
    private double myValue;
    public MyDouble (double inputInt) {
        myValue = inputInt;
    }
    public double getMeasure() {
        return myValue;
    }
}
