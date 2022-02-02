/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5121poetest;

import javax.swing.JOptionPane;

/**
 *
 * @author ctill
 */
public class Messages 
{
    
    boolean studentTypeSelected;
    String valueCheckOutcome;
    
    
    public boolean goodStudent(String studentType)
    {
        if (studentType.equalsIgnoreCase("good"))
        {
            studentTypeSelected = true;
        }
        
        else 
        {
            studentTypeSelected = false;
        }
        
        return studentTypeSelected;
        
    }
    
     public String printMessage(String studentType )
    {
        String positiveMessage = "Well done you passed!";
        String negativeMessage = "Bad luck try again next time";
        Messages studentMessages = new Messages();
        
       boolean studentStatus = studentMessages.goodStudent(studentType);
       
        if (studentStatus) 
        {
            return positiveMessage;
        }
        else
        {
           return  negativeMessage;
        }
    
    }
    
       public String ceckValue(String value)
       {
           if (value.contains("!")&& value.length()==4)
           {
               valueCheckOutcome = "Value is correct ";
           }
           
           else
           {
               valueCheckOutcome ="Value is not correct";
           }
           
           return valueCheckOutcome;
           
       }
        
    
       
}
