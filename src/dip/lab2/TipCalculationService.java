/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author kraymond4
 */
public class TipCalculationService 
{
   private TipCalculatorStrategy tipcalculator;
   
   public TipCalculationService()
   {}
   
   public TipCalculationService(TipCalculatorStrategy t)
   {
       setTipCalculator(t);
   }
   
   
   public final void setTipCalculator(TipCalculatorStrategy t)
   {
       this.tipcalculator = t;
   }
   
   public double calculateTip ()
   {
       return tipcalculator.getTip();
   }
   
   public double calculateTip(TipCalculatorStrategy tipcalculator2)
   {
       return tipcalculator2.getTip();
   }
}
