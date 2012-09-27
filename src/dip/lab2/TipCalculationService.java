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
   private TipCalculator t;
   
   public TipCalculationService()
   {}
   
   public TipCalculationService(TipCalculator t)
   {
       setTipCalculator(t);
   }
   
   
   public final void setTipCalculator(TipCalculator t)
   {
       this.t = t;
   }
   
   public double calculateTip ()
   {
       return t.getTip();
   }
}
