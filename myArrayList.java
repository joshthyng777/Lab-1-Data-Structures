import java.util.ArrayList;
import java.util.Arrays;

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
    /* Gabrielle Akers
     * September 13, 2023
     */
    public ArrayList<Fraction> remove (Fraction input) {
        ArrayList<Fraction> fractions = new ArrayList<>();
        for(int i = 0; i < elements.length; i++) {
            if(elements[i] != input) {
                fractions.add(input);
            }
        }
        return fractions;
    }
    
    /**
     * @author Ellis Fitzgerald
     * @version September 18th 2023
     * add - A method to add to the end of our custom array list
     * @param input - What is intended to be added to the array list
     * @return Returns to show the function passed
     */
    public boolean add(Fraction  input) {
        int lastIndex = size;
        if(elements.length == size) {
            grow();
        }
        elements[lastIndex] = input;
        size++;
        return true;
        
    }
    
    /**
     * @author Ellis Fitzgerald
     * @version September 18th 2023
     * grow - A method to be called when the last index passes the current elements length, forcing the array to grow by {@codeGROWTH_FACTOR}
     * @return newElements - the new elements
     */
    private Object[] grow() {
        Object[] newElements = Arrays.copyOf(elements, (int) (elements.length * GROWTH_FACTOR));
        elements = newElements;
        return newElements;
        
        
    }
    
    
}