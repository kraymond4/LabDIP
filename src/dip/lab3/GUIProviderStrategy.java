/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import javax.swing.JOptionPane;
/**
 *
 * @author Kyle Raymond
 */
public class GUIProviderStrategy implements ProviderStrategy
{
    private String message;
    
    

    public void setMessage() 
    {
        this.message =
       JOptionPane.showInputDialog(null, "Enter message here:");
    }

    public String getMessage() 
    {
        return this.message;
    }
    
}
