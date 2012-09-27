/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author kraymond4
 */
public interface TipCalculatorStrategy 
{
    
    public enum ServiceQuality 
    {
        GOOD, FAIR, POOR
    }
    
    
    public abstract double getTip();
    
    
}
