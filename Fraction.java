// Fraction
public class Fraction implements INumber<Object>, Comparable<Fraction> {
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
        if (fraction.numerator == 0 || fraction.denominator == 0) {
            return false;
        } else {
            boolean isEqual = (this.numerator * fraction.denominator) == (fraction.numerator * this.denominator);
            return isEqual;
        }

    }
    public static void main(String[] args) {
		Fraction[] fractionArray = new Fraction[100];
		for(int i=0; i<fractionArray.length; i++)
		fractionArray[i] = new Fraction(i, i+1);
		
		printReverse(fractionArray);
	}
	/**
	 * @author Jonah Kastelic 
	 * printReverse return value: Prints a reversed array of fractions
	 * @param inputArray an array of Fraction objects to be reversed
	 */
	static void printReverse(Fraction[] inputArray) {
		for (int i = inputArray.length - 1; i >= 0; i--) {
			System.out.print(inputArray[i].toString());
		}
	}
	
	/**
	 * @author Jonah Kastelic
	 * toString method which allows for Fractions to be easily printed
	 * @return String of numerators and denominators
	 */
	public String toString() {
		return " (" + numerator + "," + denominator + ") ";
	}
}

    @Override
    /**
     * @author Ellis Fitzgerald
     * @version 13 September 2023
     * @param input - An object that is casted to a Fraction
     *              plus - Adds this Fraction with input Fraction
     */
    public Object plus(Object input) {
        Fraction frac = (Fraction) input;
        int sumNumerator = (this.numerator * frac.denominator) + (frac.numerator * this.denominator);
        int sumDenominator = this.denominator * frac.denominator;
        return new Fraction(sumNumerator, sumDenominator);
    }

    @Override
    /**
     * @author Ellis Fitzgerald
     * @version 13 September 2023
     * @param input - An object that is casted to a Fraction
     *              minus - Subtracts this Fraction with input Fraction
     */
    public Object minus(Object input) {
        Fraction frac = (Fraction) input;
        int subNumerator = (this.numerator * frac.denominator) - (frac.numerator * this.denominator);
        int subDenominator = this.denominator * frac.denominator;
        return new Fraction(subNumerator, subDenominator);
    }

    //Divide method
    @Override
    public Object divide(Object input) {
        Fraction frac = (Fraction) input;

        int divNumerator = this.numerator * frac.denominator;
        int divDenominator = this.denominator * frac.numerator;

        return new Fraction(divNumerator, divDenominator);
    }

    @Override
    /**
     * @author Ellis Fitzgerald
     * @version 13 September 2023
     * @param input - An object that is casted to a Fraction
     *              multiply - Multiplies this Fraction with input Fraction
     * 
     */
    public Object multiply(Object input) {
        Fraction frac = (Fraction) input;
        int productNumerator = this.numerator * frac.numerator;
        int productDenominator = this.denominator * frac.denominator;
        return new Fraction(productNumerator, productDenominator);
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub

    }

    @Override
    public int compareTo(Fraction o) {
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
