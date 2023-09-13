public interface INumber<T> {
    T plus(T input);
    T minus(T input);
    T divide(T input);
    T multiply(T input);
    void print();
    
}