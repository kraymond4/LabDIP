/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Kyle Raymond
 */
public class ConsoleRendererStrategy implements RendererStrategy
{

    public void displayMessage(String message) 
    {
        System.out.println(message);
    }
    
}
