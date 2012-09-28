package dip.lab2;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup 
{
    
 
    public static void main(String[] args) 
    {
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        BaggageServiceTipCalculatorStrategy servant1 = new BaggageServiceTipCalculatorStrategy(TipCalculatorStrategy.ServiceQuality.FAIR, 3);
        FoodServiceTipCalculatorStrategy servant2 = new FoodServiceTipCalculatorStrategy(TipCalculatorStrategy.ServiceQuality.GOOD, 55.00);
        
        
        
        TipCalculationService tipCalculation = new TipCalculationService();
        
        System.out.println("The tip amount for Baggage handling is: " + nf.format(tipCalculation.calculateTip(servant1)));
        System.out.println("The tip amount for a waiter's service is: " + nf.format(tipCalculation.calculateTip(servant2)));
        
    }

}
