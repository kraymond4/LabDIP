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
    
    public MessageService(ProviderStrategy p, RendererStrategy r)
    {
        setProviderStrategy(p);
        setRendererStrategy(r);
    }
    
    
    public final void setProviderStrategy(ProviderStrategy p)
    {
        input = p;
    }
    
    public final void setRendererStrategy(RendererStrategy r)
    {
        output = r;
    }
    
    
    
    public final void PerformMessageService()
    {
        input.setMessage();
        output.displayMessage(input.getMessage());
    }
    
    
}
