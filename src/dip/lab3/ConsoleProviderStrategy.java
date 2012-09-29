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
    
    
    
    public void setMessage() 
    {
        //needs validation
        System.out.println("Enter your message:");
        this.message = keyboard.nextLine();
    }

    public String getMessage() 
    {
        return this.message;
    }
    
}
