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
         String quit="no";
         Messages studentMessages = new Messages();
         Utility util = new Utility();
       
         String studentType  =studentMessages.printMessage("good");
         String studentNameCheck = studentMessages.ceckValue("molly!");
         JOptionPane.showMessageDialog(null, studentType);
         JOptionPane.showMessageDialog(null, studentNameCheck);
         
         int menu = Integer.parseInt(JOptionPane.showInputDialog("1:Add tasks, 2:Report, 3:Quit"));
         
         menuloop:
         while(true)
         {
           
             switch(menu)
         {
             case 1:
                    int numTasks = numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Tasks "));
                     util.Addtasks(numTasks);
                     return;
                     
             case 2 :
                 JOptionPane.showMessageDialog(null, "Feature is coming soon");
                 break;
             case 3 :
                 break menuloop;
         
         }
         
         
         
         
         }
         
         
         
         
         
         
      
       
       
   
    }
    
   
    
   
    
}
