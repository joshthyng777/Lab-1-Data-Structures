public class myArrayList<T> {
    private static final int INITIAL_CAPACITY = 50;
    private static final double GROWTH_FACTOR = 1.2;

    private Object[] elements;
    private int size;

    //Josh Thyng  (Boolean Contains)
    public myArrayList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public boolean contains(Fraction input) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && elements[i] instanceof Fraction) {
                Fraction fraction = (Fraction) elements[i];
                if (fraction.equals(input)) {
                    return true;
                }
            }
        }
        return false;
    }

}