// Fraction
public class Fraction implements INumber<Object> {
    int numerator;
    int denominator;
    
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    /**
     * @author Ellis Fitzgerald
     * @version 12 September 2023
     * @param one - First fraction to compare
     * @return boolean - If the parameter one and parameter two are the same value
     */
    public boolean hasSameValue(Fraction fraction) {
        if(fraction.numerator == 0 || fraction.denominator == 0) {
            return false;
        }
        else {
            boolean isEqual = (this.numerator * fraction.denominator) == (fraction.numerator * this.denominator);
            return isEqual;
        }
      
    }

    @Override
    /**
     * @author Ellis Fitzgerald
     * @version 13 September 2023
     * @param input - An object that is casted to a Fraction
     * plus - Adds this Fraction with input Fraction
     */
    public Object plus(Object input) {
        Fraction frac = (Fraction)input;
        int sumNumerator = (this.numerator * frac.denominator) + (frac.numerator * this.denominator);
        int sumDenominator = this.denominator * frac.denominator;
        return new Fraction(sumNumerator, sumDenominator);
    }

    @Override
    /**
     * @author Ellis Fitzgerald
     * @version 13 September 2023
     * @param input - An object that is casted to a Fraction
     * minus - Subtracts this Fraction with input Fraction
     */
    public Object minus(Object input) {
        Fraction frac = (Fraction)input;
        int subNumerator = (this.numerator * frac.denominator) - (frac.numerator * this.denominator);
        int subDenominator = this.denominator * frac.denominator;
        return new Fraction(subNumerator, subDenominator);
    }

    @Override
    public Object divide(Object input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    /**
     * @author Ellis Fitzgerald
     * @version 13 September 2023
     * @param input - An object that is casted to a Fraction
     * multiply - Multiplies this Fraction with input Fraction
     * 
     */
    public Object multiply(Object input) {
        Fraction frac = (Fraction)input;
        int productNumerator = this.numerator * frac.numerator;
        int productDenominator = this.denominator * frac.denominator;
        return new Fraction(productNumerator, productDenominator);
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        
    }
}
