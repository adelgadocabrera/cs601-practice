package practice;

/**
 * A class that maintains a single fraction.
 * @author srollins
 *
 */
public class Fraction {
    int num;
    int den;

    // REPLACE WITH YOUR SOLUTION
    /**
     * Constructor.
     */
    public Fraction(int numerator, int denominator) {
        // REPLACE WITH YOUR SOLUTION
        num = numerator;
        den = denominator;
    }

    /**
     * Return the numerator.
     * @return
     */
    public int getNumerator() {
        // REPLACE WITH YOUR SOLUTION
        return num;
    }

    /**
     * Return the denominator.
     * @return
     */
    public int getDenominator() {
        // REPLACE WITH YOUR SOLUTION
        return den;
    }

    /**
     * Returns the floating point value of this
     * fraction.
     * @return
     */
    public double getDoubleValue() {
        // REPLACE WITH YOUR SOLUTION
        int divider = num / den;
        double numDouble = (double) num;
        double denDouble = (double) den;
        return (double) (numDouble / denDouble);
    }

    /**
     * Returns a string representation of this fraction
     * of the form <numerator>/<denominator>
     *
     * Examples: 1/3 or 9/2
     */
    public String toString() {
        // REPLACE WITH YOUR SOLUTION
        return String.valueOf(num) + "/" + String.valueOf(den);
    }

}
