/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import java.util.Scanner;
/**
 *
 * @author Kyle Raymond
 */
public class ConsoleProviderStrategy implements ProviderStrategy
{

    private String message;
    private Scanner keyboard = new Scanner(System.in);
    
    public ConsoleProviderStrategy()
    {
        System.out.println("Enter a message:");
        setMessage(keyboard.nextLine());
    }
    
    public void setMessage(String message) 
    {
        //needs validation
        this.message = message;
    }

    public String getMessage() 
    {
        return message;
    }
    
}
