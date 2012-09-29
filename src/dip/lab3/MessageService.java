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
    private ProviderStrategy input;
    
    private RendererStrategy output;
    
    
    
    
    public void SetProviderStrategy(ProviderStrategy p)
    {
        input = p;
    }
    
    public void SetRendererStrategy(RendererStrategy r)
    {
        output = r;
    }
    
    
    
    public void PerformMessageService()
    {
        input.setMessage();
        output.displayMessage(input.getMessage());
    }
    
    
}
