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
public class Utility 
{
    
    public void Addtasks(int numTasks)
    {
        Tasks addTask = new Tasks();
        
         
        
        
        for (int i = 0; i < numTasks; i++) {
            
        
       String taskName =  JOptionPane.showInputDialog("Enter Task Name");
       int taskNumber = i;
       String taskDescription = JOptionPane.showInputDialog("Enter Task Description");
       String developerFirstName = JOptionPane.showInputDialog("Enter Task Developer First Name");
       String developerLastName = JOptionPane.showInputDialog("Enter Task Developer Last Name");
       int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration in hours"));
       String taskSatus = JOptionPane.showInputDialog("Please select one of the following task statuses: To Do, Done, Doing");
       boolean descriptionCheck =  addTask.checkTaskDescription(taskDescription);
       String taskID = addTask.createTaskID(taskName, taskNumber, developerFirstName);
       String printTask = addTask.printMessageValue(taskName, taskNumber, taskDescription, developerFirstName, taskName, duration, taskID.toUpperCase(), taskSatus);
       
       JOptionPane.showMessageDialog(null, printTask);
    
        }
    
    }
    
}
