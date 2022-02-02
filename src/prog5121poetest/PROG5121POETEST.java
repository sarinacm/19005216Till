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
public class PROG5121POETEST {
    
  

    /**
     * @param args the command line arguments
     * 
     */
    
   
    public static void main(String[] args) 
    {
         Messages studentMessages = new Messages();
       
         String studentType  =studentMessages.printMessage("good");
         String studentNameCheck = studentMessages.ceckValue("molly!");
         JOptionPane.showMessageDialog(null, studentType);
         JOptionPane.showMessageDialog(null, studentNameCheck);
      
        
     
        
    }
    
   
    
   
    
}
