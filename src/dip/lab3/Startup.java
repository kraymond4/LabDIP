/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Kyle Raymond
 */
public class Startup 
{
    public static void main(String[] args) 
    {
        
    
        MessageService popMail = new MessageService(new ConsoleProviderStrategy(), new GUIRendererStrategy());
    
        MessageService screenMail = new MessageService(new GUIProviderStrategy(), new ConsoleRendererStrategy());
    
        popMail.performMessageService();
        
        screenMail.performMessageService();
    
    }
}
