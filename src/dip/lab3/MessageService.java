/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Kyle Raymond
 */
public class MessageService 
{
    private ProviderStrategy input = new ConsoleProviderStrategy();
    private ProviderStrategy input2 = new GUIProviderStrategy();
    
    
    private RendererStrategy output = new GUIRendererStrategy();
    private RendererStrategy output2 = new ConsoleRendererStrategy();
}
