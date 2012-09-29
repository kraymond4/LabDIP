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
public class GUIRendererStrategy implements RendererStrategy
{

    public void displayMessage(String message) 
    {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
