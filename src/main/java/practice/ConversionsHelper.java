package practice;

/**
 * A class to help with several common conversions.
 * @author srollins
 *
 */
public class ConversionsHelper {

    /**
     * Converts ounces to gallons.
     * One gallon is 128 ounces.
     *
     * @param ounces
     * @return
     */
    public double ouncesToGallons(int ounces) {
        //REPLACE WITH YOUR SOLUTION
        double ounceDouble = (double) (ounces);
        return (double) ( ounceDouble / 128);
    }

    /**
     * Converts centimeters to feet.
     * One foot is 30.48 cm.
     *
     * @param cm
     * @return
     */
    public double cmToFeet(int cm) {
        //REPLACE WITH YOUR SOLUTION
        return (double) (cm / 30.48);
    }
}
