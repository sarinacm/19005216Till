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
public class Tasks 
{
    
  
   boolean checkTaskDescription(String taskDescription)
   {
       if (taskDescription.length() <= 50) 
       {
           
          return true;
       }
       
       else
       {
            return false;
       }
   
   }
   
   public String createTaskID(String taskName, int taskNumber, String developerName)
   {
       
       String taskID = taskName.substring(0,2)+ ":" + 
               Integer.toString(taskNumber)+ ":" +  developerName.substring(developerName.length()-3);
         
       
       return taskID.toUpperCase() ;
   
   }
   
   public String printTaskDetails(String taskName, int taskNumber, String taskDescription ,
   String devFirstName, String devLastName, int taskDuration, String taskID, String taskStatus )
   {
    
    String printValue = taskName+ " " + Integer.toString(taskNumber)+ " " + taskDescription + 
            " " + devFirstName+ " " + devLastName+ " " + Integer.toString(taskDuration)+" " + taskID+ " "+ taskStatus;
    
    return printValue;
    
   }
   
   public int returnTotalHours(int enteredHours)
   {
      
       enteredHours+=enteredHours;
       
       return enteredHours;
   
   }
   
 
   public String [] populateDeveloperArray()
   {
       String [] developers = new String[] {"Mike Smith", "Edward Harrington"
       , "Samantha Paulson", "Glenda Oberholzer"};
 
       return developers;
   
   }
   
   public String [] populateTaskNameArray()
   {
   
    String [] TaskName = new String[] {"Create Login", "Create Add Features"
       , "Create Reports", "Create Arrays"};
 
       return TaskName;
   
   }
   

   
   
   
}
