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
         Tasks tasks = new Tasks();
         Search search = new Search();
         
       
         String studentType  =studentMessages.printMessage("good");
         String studentNameCheck = studentMessages.ceckValue("molly!");
         JOptionPane.showMessageDialog(null, studentType);
         JOptionPane.showMessageDialog(null, studentNameCheck);
         
        
          int menu = Integer.parseInt(JOptionPane.showInputDialog("1:Add tasks,  2:Report, 3:quit"));
          int numTasks=0;
          
  
          menuloop:
           while(true)
         {
             switch(menu)
            {
                case 1:
                       numTasks = numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Tasks "));
                       for (int i = 1; i <= numTasks; i++) 
                       {
                            String taskName =  JOptionPane.showInputDialog("Enter Task Name");
                            int taskNumber = i;
                            String taskDescription = JOptionPane.showInputDialog("Enter Task Description");
                            String developerFirstName = JOptionPane.showInputDialog("Enter Task Developer First Name");
                            String developerLastName = JOptionPane.showInputDialog("Enter Task Developer Last Name");
                            int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration in hours"));
                            String taskSatus = JOptionPane.showInputDialog("Please select one of the following task statuses: To Do, Done, Doing");
                            String finalTaskDetails = tasks.printTaskDetails(taskName, taskNumber, taskDescription, developerFirstName, taskName, duration, taskName, taskSatus);
                            JOptionPane.showMessageDialog(null, finalTaskDetails);
                            
                           int totalHours = tasks.returnTotalHours(duration);
                           
                           JOptionPane.showMessageDialog(null, Integer.toString(totalHours));
                           
                           
                           
                       }
                       break menuloop;

                case 2 :
                     
                    String[] capturedDevelopers = new String[3];
                    String[] taskNames = new String[3];
                    capturedDevelopers = tasks.populateDeveloperArray();
                    taskNames = tasks.populateTaskNameArray();
                    
                        for (String capturedDeveloper : capturedDevelopers) {
                            JOptionPane.showMessageDialog(null, capturedDeveloper);
                        }
                        
                         for (String taskName : taskNames) {
                            JOptionPane.showMessageDialog(null, taskName);
                        }
                        
                        String searchTaskResult = search.searchbyTask("Create Reports", taskNames, capturedDevelopers);
                        JOptionPane.showMessageDialog(null, searchTaskResult);
                    return;
                case 3:
                    return;
                 
            }
   
    }
    
    }
    
    
}
